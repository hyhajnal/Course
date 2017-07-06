'use strict';

angular.module('eduApp')
    .controller('GradeCtrl', ['$scope', '$http','$stateParams',function($scope, $http,$stateParams) {
        $scope.gridOptions = {
            enableRowSelection: true,
            enableSelectAll: true,
            onRegisterApi: function(gridApi){
              $scope.gridApi = gridApi;
            }
        };
        $scope.gridOptions.enableCellEditOnFocus = true;

        $scope.gridOptions.columnDefs = [{
            name: 'sno',
            displayName: '学号',
            width: 170,
            enableCellEdit: false
        },{
            name: 'sname',
            displayName: '姓名',
            width: 150
        }, {
            name: 'sgrade',
            displayName: '年级',
            enableCellEdit: false,
            width: 120
        },{
            name: 'ssex',
            displayName: '性别',
            enableCellEdit: false,
            width: 120
        },{
            name: 'majorname',
            displayName: '学院',
            width: 150
        },{
            name: 'dept',
            displayName: '专业',
            width: 150
        },{
            name: 'score',
            displayName: '分数（可编辑）',
            enableCellEdit: true,
            width: 150
        }];

        /*$http.get('../../data/stu'+$stateParams.cno+'.json')
            .success(function(data) {
                $scope.gridOptions.data = data;
            });*/
        $http.jsonp('http://localhost:8080/EduMaster/queryStuByCno.do?cno='+$stateParams.cno+'&&callback=JSON_CALLBACK') 
            .success(function(data) {
                $scope.gridOptions.data = data;
            });

        $scope.currentFocused = "";

        $scope.getCurrentFocus = function() {
            var rowCol = $scope.gridApi.cellNav.getFocusedCell();
            if (rowCol !== null) {
                $scope.currentFocused = 'Row Id:' + rowCol.row.entity.id + ' col:' + rowCol.col.colDef.name;
            }
        }
        /*修改成绩，发送后台*/
        $scope.state = {};
        $scope.param={
        };
        
        $scope.saveState = function() {
            $scope.state = $scope.gridApi.saveState.save();
            var data = $scope.gridOptions.data;
            var index = $scope.state.selection;
            var sc = new Array();
            for(var i=0;i < index.length;i++){
                $scope.param.cno = parseInt($stateParams.cno);
                $scope.param.sno = data[index[i].row].sno;
                $scope.param.score = data[index[i].row].score;
                sc.push($scope.param);
                $scope.param = {};
            }
            /*console.log(sc);*/
            $http.post('http://localhost:8080/EduMaster/updateGrade.do', JSON.stringify(sc))
            .success(function(data){
               alert("修改成功");
               location.reload();
            })
            .error(function(data){
                alert("修改成功");
                location.reload();
            });
            /*var gL={'scList': scList };*/
            /*$http.post('http://localhost:8080/EduMaster/updateGrade.do',
                sc,
                {'Content-Type':'application/x-www-form-urlencoded'})
                .success(function(data){
                    alert("修改成功");
                    reload(location);
                })
                .error(function(data){
                    alert("修改失败");
                });*/
            /*$http({
                method: 'POST',
                url: 'http://localhost:8080/EduMaster/updateGrade.do',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'},
                transformRequest: function(obj) {
                    var str = [];
                    for(var p in obj)
                    str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
                    return str.join("&");
                },
                data:sc
            }).success(function () {

            });*/

 
        }

    }]);


angular.module('eduApp').controller('ClassTypeCtrl', ['$scope','ClassService',
    function($scope, ClassService) {
       /*$stateParams.cno*/ 
       ClassService.classType()
        .success(function(data, status) {
            $scope.classes = data;
        });
    }
]);