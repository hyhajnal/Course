'use strict';


  angular.module('eduApp', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ui.router',
  'ngTouch',
  'ui.grid',
  'ui.grid.edit',
  'ui.grid.cellNav',
  'ngAnimate', 
  'ui.grid.selection',
  'mgcrea.ngStrap.modal',
  'ui.grid.saveState'
])
  .config(function ($stateProvider, $urlRouterProvider) {
    //delete $httpProvider.defaults.headers.common['X-Requested-With'];
    $urlRouterProvider.otherwise('/');
    $stateProvider
      .state('index', {
        url: '/',
        templateUrl: 'views/loginForm.html',
        controller:'MainCtrl'
      })
      .state('home', {
        url: '/home',
        templateUrl: 'views/home.html',
        controller:'MainCtrl'
      })
      .state('home.about', {
        url: '/about',
        templateUrl: 'views/about.html',
        controller:'AboutCtrl'
      })
      .state('home.addClass', {
        url: '/addClass',
        templateUrl: 'views/addClass.html',
        controller:'AddclassCtrl'
      })
      .state('home.myClass', {
        url: '/myClass',
        templateUrl: 'views/myClass.html',
        controller:'MainCtrl'
      })
      .state('home.table', {
        url: '/table',
        controller:'TableCtrl',
        templateUrl: 'views/table.html'  
 
      })
      .state('home.grade', {
        url: '/grade/:cno',
        controller:'GradeCtrl',
        views: {  
            '': {
                templateUrl: 'views/grade.html'  
            },  
            'classType@home.grade': {  
                templateUrl: 'views/classType.html'  
            },  
             'stuList@home.grade': { 
                templateUrl: 'views/stuList.html'  
            }  
        }
      })
  });




