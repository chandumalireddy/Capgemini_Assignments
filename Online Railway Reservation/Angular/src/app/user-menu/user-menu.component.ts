import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-user-menu',
  templateUrl: './user-menu.component.html',
  styleUrls: ['./user-menu.component.css'],
  encapsulation:ViewEncapsulation.None
})
export class UserMenuComponent implements OnInit {
  train:Train[]=[];
  constructor( private route: ActivatedRoute,
    private router: Router,private trainService:TrainServiceService) { }

  ngOnInit(): void {
  }
bookTicket(){

  this.router.navigate(['/userMenu/bookticket']);

}
deleteTicket(){
  this.router.navigate(['/userMenu/cancelticket']);
}
viewTrainTicket(){
  this.router.navigate(['/userMenu/viewtrains']);
}
logout(){}
minDate='2021-04-24';
 public trainSource:any;
 public trainDestination:any;
 public date:any;

getTrainFromSourceToDestinationWithDate(trainSource: any,trainDestination:any,date:any) {
  console.log("hello");
  this.trainSource=trainSource
  this.trainDestination=trainDestination
  this.date=date;
      this.trainService.getTrainByTrainFromSourceToDestinationWithDate(this.trainSource,this.trainDestination,this.date)
  .subscribe(data => {this.train=data;
  console.log(this.train);
  }, error => console.log(error));
}
book(trainName:any,source:any,destination:any,date:any,type:any,fare:any){
 this.router.navigate(['/userMenu/bookticket',trainName,source,destination,date,type,fare]);
}
public show5=false
routee(){
  this.show5=true;
}
}
