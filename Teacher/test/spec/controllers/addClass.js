'use strict';

describe('Controller: AddclassCtrl', function () {

  // load the controller's module
  beforeEach(module('eduApp'));

  var AddclassCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    AddclassCtrl = $controller('AddclassCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
