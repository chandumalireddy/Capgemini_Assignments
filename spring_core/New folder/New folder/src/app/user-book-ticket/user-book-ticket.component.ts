import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-user-book-ticket',
  templateUrl: './user-book-ticket.component.html',
  styleUrls: ['./user-book-ticket.component.css']
})
export class UserBookTicketComponent implements OnInit {



  ngOnInit(): void {
  }
  train:Train[]=[];
  trainNumber:any
 trainSource:any;
 trainDestination:any;
 date:any;
 show1=false;
 show2=false
 show3=false
 show4=false
   constructor(private router: Router,private trainService:TrainServiceService){}
 
 
 
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
   book(trainName:any,source:any,destination:any,date:any){
    this.router.navigate(['/userMenu/bookticket',trainName,source,destination,date]);
   }
  
 }
