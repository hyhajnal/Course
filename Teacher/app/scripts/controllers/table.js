'use strict';

angular.module('eduApp')
  .controller('TableCtrl', ['$scope','$modal','ClassService',
  	function ($scope,$modal,ClassService) {
      ClassService.classList()
          .success(function(data, status) {
              $scope.Mons = data.Mon;
              $scope.Tues = data.Tue;
              $scope.Weds = data.Wed;
              $scope.Thrs = data.Thr;
              $scope.Fris = data.Fri;
          });  


          $scope.editModel={
            };
        $scope.detail = function (text,cno) {  
          $scope.editModel.cno=cno;
          $scope.editModel.text=text;

          $modal({
            title: '详情',
            content:'<div class="form-group">'+
                          '<textarea class="form-control" rows="3" ng-model="editModel.text">'+$scope.editModel.text+'</textarea>'
                      +'</div><button type="button" class="btn btn-primary btn-lg" ng-click="editSubmit('+$scope.editModel.cno+',&quot;'+$scope.editModel.text+'&quot;)">提交</button>', 
            show: true,
            html:true,
            controller:'TableCtrl'
          }); 
          

        };  

    }
  ]);
