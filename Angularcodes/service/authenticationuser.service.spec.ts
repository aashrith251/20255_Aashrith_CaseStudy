import { TestBed } from '@angular/core/testing';

import { AuthenticationuserService } from './authenticationuser.service';

describe('AuthenticationuserService', () => {
  let service: AuthenticationuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthenticationuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
