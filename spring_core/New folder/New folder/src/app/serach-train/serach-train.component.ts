import { Component, OnInit } from '@angular/core';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-serach-train',
  templateUrl: './serach-train.component.html',
  styleUrls: ['./serach-train.component.css']
})
export class SerachTrainComponent implements OnInit {
  train:Train[]=[];
 trainNumber:any
trainSource:any;
trainDestination:any;
date:any;
show1=false;
show2=false
show3=false
show4=false
show5=false
  constructor(private trainService:TrainServiceService){

  }

  ngOnInit(): void {
  }
  getTrain(trainNo: any) {
    console.log("hello");
    this.trainNumber=trainNo
    this.trainService.getTrainByTrainNo(this.trainNumber)
    .subscribe(data => {this.train=data;
    console.log(this.train);
    }, error => console.log(error));
  }
  getTrainFromSourceToDestination(trainSource: any,trainDestination:any) {
    console.log("hello");
    this.trainSource=trainSource
    this.trainDestination=trainDestination
        this.trainService.getTrainByTrainFromSourceToDestination(this.trainSource,this.trainDestination)
    .subscribe(data => {this.train=data;
    console.log(this.train);
    }, error => console.log(error));
  }
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
  ByTrainNo()
  {
   this.show1=true; 
   this.show2=false; 
   this.show3=false; 
  }
  sourceToDestination()
  {
   this.show1=false; 
   this.show2=true; 
   this.show3=false; 
  }
  sourceToDestinationWithDate()
  {
   this.show1=false; 
   this.show2=false; 
   this.show3=true; 
  }
  route(){
    this.show5=true;
  }
}