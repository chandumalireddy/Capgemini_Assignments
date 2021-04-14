import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-add-trains',
  templateUrl: './add-trains.component.html',
  styleUrls: ['./add-trains.component.css'],
  encapsulation:ViewEncapsulation.None
})
export class AddTrainsComponent implements OnInit {

  registrationform!: FormGroup;
  constructor( private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService,private fb:FormBuilder) { 
   


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


    ngOnInit(){}
    onsubmit()
    {
    
      console.log();
    
    this.authenticationService.post(this.registrationform.value)
   
    }
    logout(){
      this.authenticationService.logOut();
    }
}
