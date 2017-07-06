/*'use strict';

angular.module('eduApp')
  .factory('checkLog', function ($cookieStore) {
    var setUser=function(userId){
      $cookieStore.put("userId",userId);
    };

    var removeUser=function(){
      $cookieStore.remove("userId");
    };

    var user=$cookieStore.get("userId");

    var check=function(user){
        return $http({
                method: 'JSONP',
                url: 'http://localhost:8080/EduMaster/queryCTableByTno.do?callback=JSON_CALLBACK'
              });
    };

    return {
      checkLogin: function (user) {
        return check(user);
      },
      setUser: function (userId) {
        return setUser(userId);
      },
      getUser:function(){
        return user;
      };
      
    };
  });
*/