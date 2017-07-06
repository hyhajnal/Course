'use strict';

angular.module('eduApp')
  .controller('MainCtrl', function ($http,$scope,$cookieStore,$location) {
  	$scope.login=function(){
/*  		$cookieStore.put("userId","T001");
  		$cookieStore.remove("userId");
  		alert($cookieStore.get("userId"));
  		if($scope.user.Id==$cookieStore.get("userId")){
  			$location.path('/home');
  		}else{
  			$cookieStore.put("userId",$scope.user.Id);
  		}*/
      var tno=$scope.user.Id;
      var tpsd=$scope.user.psd;

     $http.jsonp('http://localhost:8080/EduMaster/checkTeacher.do?tno='+tno+'&&tpsd='+tpsd+'&&callback=JSON_CALLBACK') 
      .success(function(data){ 
        alert(data.message);
        if(data.message=="验证成功"){
          $cookieStore.put("userId",$scope.user.Id);
          $location.path('/home');
        }
      });
  		
  	}

    $scope.logout=function(){
      $cookieStore.remove("userId");
      $location.path('/');
    }

  });
