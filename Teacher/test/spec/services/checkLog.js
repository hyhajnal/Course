'use strict';

describe('Service: Checklog', function () {

  // load the service's module
  beforeEach(module('EduApp'));

  // instantiate service
  var Checklog;
  beforeEach(inject(function (_Checklog_) {
    Checklog = _Checklog_;
  }));

  it('should do something', function () {
    expect(!!Checklog).toBe(true);
  });

});
