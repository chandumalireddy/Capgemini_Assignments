import { Component, OnInit } from '@angular/core';
import { StationStops } from '../station-stops';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-serach-train',
  templateUrl: './serach-train.component.html',
  styleUrls: ['./serach-train.component.css']
})
export class SerachTrainComponent implements OnInit {
  train:Train[]=[];
  stations:StationStops[]=[];
 trainNumber:any
 trainName:any;
trainSource:any;
trainDestination:any;
date:any;
show1=false;
show2=false
show3=false
show4=false
show5=false
show6=false
show7=false
  constructor(private trainService:TrainServiceService){

  }
 
  minDate='2021-04-24';
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
      this.stations=data.stops;
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

  getTrainnamewithdate(trainName:any,date:any){
this.trainName=trainName
this.date=date
this.trainService.getTrainByTrainNameWithDate(this.trainName,this.date).subscribe(data=>{this.train=data})
  }
stationtt:any

  getTrainstationtt(stationtt:any,date:any){
this.stationtt=stationtt
this.date=date
this.trainService.getstationtt(this.stationtt,this.date).subscribe(data=>{
this.train=data
}
)
  }
  gettrainName(train:any){}

  ByTrainNo()
  {
   this.show1=true; 
   this.show2=false; 
   this.show3=false; 
   this.show4=false;
   this.show7=false
   this.show6=false;
  }
  ByTrainName(){
    this.show1=false; 
    this.show2=true; 
    this.show3=false; 
    this.show4=false;
    this.show7=false
    this.show6=false;
  }
  sourceToDestinationtrain()
  {
   this.show1=false; 
   this.show2=false; 
   this.show3=false; 
   this.show4=true;
   this.show7=false
   this.show6=false;
  }
  sourceToDestinationWithDate()
  {
   this.show1=false; 
   this.show2=false; 
   this.show3=true; 
   this.show4=false;
   this.show7=false
   this.show6=false;
  }
  stationtimetable(){
    this.show1=false; 
    this.show2=false; 
    this.show3=false; 
    this.show4=false;
    this.show7=true;
    this.show6=false;
  }
  trainnamewithdate(){
    this.show1=false; 
    this.show2=false; 
    this.show3=false; 
    this.show4=false;
    this.show7=false;
    this.show6=true;
  }
  route(){
    this.show5=true;
  }
}