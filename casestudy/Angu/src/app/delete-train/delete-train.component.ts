import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
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
  registrationform!: FormGroup;
  constructor( private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService,private fb:FormBuilder,private trainservice:TrainServiceService) { 
   


      this.registrationform=this.fb.group({
        trainNo:[''],
      trainName:[''],
      source:[''],
      destination:[''],
      date:[''],
      arrivalTime:[''],
      departureTime:[''],
      reservationVacancy:this.fb.array([
        this.fb.group({
          type:'',
          reservations:'',
          fare:''
        })
      ]),
      stops:this.fb.array([
        this.fb.group({
          stationName:''
        })
      ])
      });
    }


    get vacancy() : FormArray {
      return this.registrationform.get("reservationVacancy") as FormArray
    }
    get stops() : FormArray {
      return this.registrationform.get("stops") as FormArray
    }

    addvacanyc() {
       this.vacancy.push(this.newvacancy());
    }
    addStops() {
      this.stops.push(this.newstops());
   }
 
   newvacancy(): FormGroup {
       return this.fb.group({
         type: '',
         reservations: '',
         fare:''
  
       })
    }
      
    newstops(): FormGroup {
      return this.fb.group({
        stationName: '',
      })
   }


    

  ngOnInit(): void {
  }
  getTrain(trainNo: any) {
    console.log("hello");
    this.trainNo=trainNo
    this.trainservice.getTrainByTrainNo(this.trainNo)
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
  public show=false;
  public train1:any
  public trainNo:any;
  ViewTrain(trainNo:any,trainName:any,source:any,destination:any,date:any,arrivalTime:any,departureTime:any){
 this.show=true
this.registrationform.patchValue({

  trainNo:trainNo,
  trainName:trainName,
  source:source,
  destination:destination,
date:date,
arrivalTime:arrivalTime,
departureTime:departureTime

})

  }

  onsubmit(){

    console.log(this.registrationform.value)
    this.trainservice.updatetrain(this.registrationform.value).subscribe(data=>{
      console.log(data)
    })

  }
}
