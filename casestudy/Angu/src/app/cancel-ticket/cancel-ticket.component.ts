import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { LoginServiceService } from '../login-service.service';


@Component({
  selector: 'app-cancel-ticket',
  templateUrl: './cancel-ticket.component.html',
  styleUrls: ['./cancel-ticket.component.css']
})
export class CancelTicketComponent implements OnInit {

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
this.authenticationService.cancelTicket().subscribe((result)=> {
  this.booking=result;
  }
);
  }
  public pnr:any;
  delticket(pnr:any){
this.pnr=pnr;
this.authenticationService.deleteticket(pnr);
  }

}
