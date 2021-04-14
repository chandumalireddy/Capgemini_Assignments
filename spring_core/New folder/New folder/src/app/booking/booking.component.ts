import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  registrationform!: FormGroup;
  constructor( private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService,private fb:FormBuilder) { 
   


      this.registrationform=this.fb.group({
        pnr:[''],
      username:[''],
      passengers:this.fb.array([
        this.fb.group({
          name:'',
          age:'',
          gender:'',
          city:'',
          seatNo:''
        })
      ]),
      trainname:[''],
      source:[''],
    
      destination:[''],
      date:[''],
      reservationtype:[''],
     
     
      });
    }


    get passengers() : FormArray {
      return this.registrationform.get("passengers") as FormArray
    }
    

    addpassenger() {
       this.passengers.push(this.newpassenger());
    }
    
 
   newpassenger(): FormGroup {
       return this.fb.group({
        name: '',
         age: '',
         gender:'',
         city:'',
         seatNo:''
  
       })
    }
      
  


    ngOnInit(){
      this.registrationform.patchValue({
        trainname:this.route.snapshot.paramMap.get('trainName'),
        source:this.route.snapshot.paramMap.get('source'),
        destination:this.route.snapshot.paramMap.get('destination'),
        date:this.route.snapshot.paramMap.get('date')
      })
   

    }
    onsubmit()
    {
    
      console.log();
    
    this.authenticationService.bookTicket(this.registrationform.value)
   
    }
    logout(){
      this.authenticationService.logOut();
    }
}


