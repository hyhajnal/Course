'use strict';

angular.module('eduApp')
  .factory('ClassService', ['$http','$cookieStore',
      function ($http,$cookieStore) {
      // Service logic
      // ...
      var userId = $cookieStore.get("userId");
      var doRequest = function() {
              /*return $http({
                  method: 'GET',
                  url: '../../data/user.json'
              });*/

             return $http({
                method: 'JSONP',
                url: 'http://localhost:8080/EduMaster/queryTeacher.do?tno='+userId+'&&callback=JSON_CALLBACK'
              });
          }

      var classRequest = function() {
              /*return $http({
                  method: 'GET',
                  url: '../../data/class.json'
              });*/
              return $http({
                method: 'JSONP',
                url: 'http://localhost:8080/EduMaster/queryCTableByTno.do?tno='+userId+'&&callback=JSON_CALLBACK'
              });
          }
      var classTypeRequest = function() {
              /*return $http({
                  method: 'GET',
                  url: '../../data/classType.json'
              });*/
              return $http({
                method: 'JSONP',
                url: 'http://localhost:8080/EduMaster/queryClassByTno.do?tno='+userId+'&&callback=JSON_CALLBACK'
              });
          }

      // Public API here
      return {
          userList: function() {
              return doRequest();
          },
          classList: function() {
              return classRequest();
          },
          classType: function() {
              return classTypeRequest();
          }
      };
    }
  ]);
