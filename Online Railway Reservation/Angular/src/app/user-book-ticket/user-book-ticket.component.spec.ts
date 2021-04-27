import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserBookTicketComponent } from './user-book-ticket.component';

describe('UserBookTicketComponent', () => {
  let component: UserBookTicketComponent;
  let fixture: ComponentFixture<UserBookTicketComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserBookTicketComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UserBookTicketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
