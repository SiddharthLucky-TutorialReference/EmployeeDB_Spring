import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaydepartmentComponent } from './displaydepartment.component';

describe('DisplaydepartmentComponent', () => {
  let component: DisplaydepartmentComponent;
  let fixture: ComponentFixture<DisplaydepartmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplaydepartmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplaydepartmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
