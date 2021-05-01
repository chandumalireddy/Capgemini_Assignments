import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { LoginServiceService } from '../login-service.service';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-user-book-ticket',
  templateUrl: './user-book-ticket.component.html',
  styleUrls: ['./user-book-ticket.component.css']
})
export class UserBookTicketComponent implements OnInit {
  booking:Booking[]=[];
  constructor(
    private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService) {   }
    public isCollapsed = false;
   
    public show5=false
    routee(){
      this.show5=true;
    }
  
    ngOnInit(): void {
      this.authenticationService.getticketbyDate().subscribe((result)=> {
        this.booking=result;
        console.log(this.booking)
        }
      );
        }
    
        delticket(pnr:any){
      
            this.authenticationService.deleteticket(pnr).subscribe( data => {
              this.booking = this.booking.filter(u => u.pnr !==pnr);
        })
        }
      }
