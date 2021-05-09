import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

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
  public trainname:any
  public date:any;
  passengerticket(trainName:any,date:any){
this.trainname=trainName
this.date=date
    this.authenticationService.passengerticket(this.trainname,this.date).subscribe((result)=> {
      this.booking=result;
      console.log(this.booking)
  }
    );
  }
  update(booking:Booking)
  {
    this.authenticationService.adminupdate(booking)
  }

}
