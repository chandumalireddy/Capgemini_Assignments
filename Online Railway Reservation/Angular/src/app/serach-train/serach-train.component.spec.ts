import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SerachTrainComponent } from './serach-train.component';

describe('SerachTrainComponent', () => {
  let component: SerachTrainComponent;
  let fixture: ComponentFixture<SerachTrainComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SerachTrainComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SerachTrainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
