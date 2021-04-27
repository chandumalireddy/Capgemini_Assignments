import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-users-list',
  templateUrl: './users-list.component.html',
  styleUrls: ['./users-list.component.css']
})
export class UsersListComponent implements OnInit {


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
this.authenticationService.getallUsers().subscribe((result)=> {
  this.booking=result;
  }
);
  }
  public username:any;
  public date:any
getuserbyname(username:any)
{
this.username=username;

this.authenticationService.getuserbyusername(this.username).subscribe((result)=> {
  this.booking=result;
  })
} 
delticket(pnr:any){
      
  this.authenticationService.deleteticket(pnr).subscribe( data => {
    this.booking = this.booking.filter(u => u.pnr !==pnr);
})
}
  }



