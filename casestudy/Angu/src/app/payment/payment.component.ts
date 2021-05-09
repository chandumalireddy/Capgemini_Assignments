import { Component, OnInit } from '@angular/core';
import{render}from 'creditcardpayments/creditCardPayments'
@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent  {

  constructor() { 
render({
  id:"#mybutton",
  currency:"USD",
value:"33.36",
onApprove:(details:any)=>{
  alert("success")
  console.log(details)
},

})
  }

 

}
