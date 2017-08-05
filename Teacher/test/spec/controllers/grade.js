'use strict';

describe('Controller: GradeCtrl', function () {

  // load the controller's module
  beforeEach(module('eduApp'));

  var GradeCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    GradeCtrl = $controller('GradeCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
