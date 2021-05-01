import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Coupon } from '../coupon';

import { LoginServiceService } from '../login-service.service';
import { ReservationType } from '../reservation-type';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  coupons=new Coupon(10,20,30,40,50)
  public show=false;
  registrationform!: FormGroup;
  
  apply(){
    this.show=true
  }
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
      fare:['']
     
     
      });
    }


    get passengers() : FormArray {
      return this.registrationform.get("passengers") as FormArray
    }
    
public a:any;
  public b: number=10;
    addpassenger() {
       this.passengers.push(this.newpassenger());
       this.a=parseInt(this.a)+parseInt(this.a)

       this.registrationform.patchValue({
         fare:this.a
       })
     
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
      
  
addcoupon(coupon:any){
this.show=false;
this.a=parseInt(this.a)-parseInt(coupon)
this.registrationform.patchValue({
  fare:this.a
})

}

    ngOnInit(){
      this.registrationform.patchValue({
        trainname:this.route.snapshot.paramMap.get('trainName'),
        source:this.route.snapshot.paramMap.get('source'),
        destination:this.route.snapshot.paramMap.get('destination'),
        date:this.route.snapshot.paramMap.get('date'),
        fare:this.route.snapshot.paramMap.get('fare'),
        reservationtype:this.route.snapshot.paramMap.get('type')
        
      })
      this.a=this.route.snapshot.paramMap.get('fare');
   

    }
    public username:any
    onsubmit()
    {

      console.log();
    
      
    this.authenticationService.bookTicket(this.registrationform.value)
   
    }
    logout(){
      this.authenticationService.logOut();
    }
    coupon(){
      this.router.navigate(['/userMenu/bookticket/coupons']);
    }
}


