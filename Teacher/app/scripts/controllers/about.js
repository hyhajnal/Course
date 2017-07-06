'use strict';
/*方法一：数据在controller里写死*/

/*angular.module('eduApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.teacher = {
      tname:'王尼玛',
      tsex:'男',
      tage:30,
      tpro:'暴走漫画官方主编',
      tinfo:'创建暴走漫画APP并成立暴走漫画公司，总部在西安，在全国许多地方都有暴漫的分公司，他的贴吧ID为“亲一下王尼玛”，也兼任暴漫吧吧主，口头禅："荆轲刺秦王，两条毛腿肩上扛"，"呵呵"，"我和我的小伙伴都惊呆了"，"shenmegui"，“小孩子不要看暴漫”,"Why are you so diao?"，“你TM在逗我”等，在暴走大事件第一季第10期时与小伙伴“王蜜桃”共同出演。'
	};

	$scope.editInfo=function(){
		window.alert("message");
	};

  });*/


/*方法二：在Controller里直接调用http*/

/*angular.module('eduApp')
 .controller('AboutCtrl', function($scope, $http) {
    $http.get("../../data/user.json")
    .success(function(response) {$scope.teacher = response.records;});
});*/

/*方法三：使用Service调用http，因为Controller会经常被销毁*/

angular.module('eduApp').controller('AboutCtrl', ['$scope','$http', 'ClassService',
    function($scope,$http,ClassService) {
       ClassService.userList()
        .success(function(data, status) {
            /*$scope.teacher = data.records;*/
            $scope.teacher = data;
        });

        $scope.editSubmit=function(){
             $http({
                method:'POST',
                url:'http://localhost:8080/EduMaster/updateTeacher.do',
                data:$.param($scope.teacher),  // pass in data as strings
                headers:{ 'Content-Type': 'application/x-www-form-urlencoded' }  // set the headers so angular passing info as form data (not request payload)
            })
                .success(function(data) {
                    console.log(data);
                    if (!data.success) {
                      alert("修改成功");
                      location.reload();
                    } else {
                      alert("修改失败");
                    }
                });
        };
    }
]);
