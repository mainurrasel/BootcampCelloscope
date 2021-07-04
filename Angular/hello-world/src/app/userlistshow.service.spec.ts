import { TestBed } from '@angular/core/testing';

import { UserlistshowService } from './userlistshow.service';

describe('UserlistshowService', () => {
  let service: UserlistshowService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserlistshowService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
