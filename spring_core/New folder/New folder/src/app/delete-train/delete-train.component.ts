import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';
import { Train } from '../train';
import { TrainServiceService } from '../train-service.service';

@Component({
  selector: 'app-delete-train',
  templateUrl: './delete-train.component.html',
  styleUrls: ['./delete-train.component.css']
})
export class DeleteTrainComponent implements OnInit {

  train:Train[]=[];

  public trainNo:any;
  constructor(
    private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService,
    private trainService:TrainServiceService)  { }

  ngOnInit(): void {
  }
  getTrain(trainNo: any) {
    console.log("hello");
    this.trainNo=trainNo
    this.trainService.getTrainByTrainNo(this.trainNo)
    .subscribe(data => {this.train=data;
    console.log(this.train);
    }, error => console.log(error));
  }

  logout(){
    this.authenticationService.logOut();
  }   

  deleteEmployee(trainName:any,date:any): void {
    this.authenticationService.delete(trainName,date)
      .subscribe( data => {
        this.train = this.train.filter(u => u.trainName !==trainName && u.date !== date);
      })
  };
}
