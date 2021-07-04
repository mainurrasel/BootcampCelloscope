import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserlistshowComponent } from './userlistshow.component';

describe('UserlistshowComponent', () => {
  let component: UserlistshowComponent;
  let fixture: ComponentFixture<UserlistshowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserlistshowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserlistshowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
