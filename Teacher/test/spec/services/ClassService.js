'use strict';

describe('Service: Classservice', function () {

  // load the service's module
  beforeEach(module('EduApp'));

  // instantiate service
  var Classservice;
  beforeEach(inject(function (_Classservice_) {
    Classservice = _Classservice_;
  }));

  it('should do something', function () {
    expect(!!Classservice).toBe(true);
  });

});
