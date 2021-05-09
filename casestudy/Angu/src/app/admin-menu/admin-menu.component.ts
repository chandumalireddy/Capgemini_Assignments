import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-admin-menu',
  templateUrl: './admin-menu.component.html',
  styleUrls: ['./admin-menu.component.css']
})
export class AdminMenuComponent implements OnInit {

  train:Train[]=[]
  train1:Train[]=[]
  public a:any;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: LoginServiceService,private trainService:TrainServiceService) {   }
  ngOnInit(){
 

this.trainService.getTrian().subscribe(data=>{

  this.train1=data;
  this.a=this.train1.length
  this.train1=this.train1.reverse()
 this.train1=this.train1.slice(0,1)


})
  }
addTrain(){
  this.router.navigate(['/adminmenu/addtrain']);
}
logout(){
  this.authenticationService.logOut();
}
deleteTrain(){
  this.router.navigate(['/adminmenu/deletetrain']);
}

}
