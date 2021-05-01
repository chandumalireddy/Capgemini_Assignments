import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { map } from 'rxjs/operators';
import { Booking } from '../booking';

import { LoginServiceService } from '../login-service.service';
import { Order } from '../order';

@Component({
  selector: 'app-dialog-ticket',
  templateUrl: './dialog-ticket.component.html',
  styleUrls: ['./dialog-ticket.component.css']
})

export class DialogTicketComponent implements OnInit {

  
  booking=new Order('','','','','')
  constructor(
    private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService) {   }
    public isCollapsed = false;
   
    public show5=false
    routee(){
      this.show5=true;
    }
  
  ngOnInit(): void {

  }
  
 
 
  
  }

