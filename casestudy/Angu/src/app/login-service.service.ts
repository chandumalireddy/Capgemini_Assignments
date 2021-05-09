import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Train } from './train';
import { map } from 'rxjs/operators';
import { Booking } from './booking';
import { User } from './user';
import { Observable } from 'rxjs';
import { Order } from './order';


@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  public username1: any;
  public password1: any;
  constructor(
    private httpClient:HttpClient
  ) { 
     }
     USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser'
//admin
     authenticate(username:any, password:any) {
     this.username1=username
     this.password1=password
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    
  
    return this.httpClient.get('http://localhost:8085/userInfo/admin/validate', { headers ,responseType:'text' as 'json'} ).pipe(
      map(
        userData => {
          sessionStorage.setItem('username', username);
          let authString = 'Basic ' + btoa(username + ':' + password);
          sessionStorage.setItem('basicauth', authString);
          return userData;
        }
      )

      
    );
  }

//user
  authenticateUser(username:any, password:any) {
    this.username1=username
    this.password1=password
   const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
   return this.httpClient.get('http://localhost:8085/userInfo/user/signin', { headers ,responseType:'text' as 'json' }).pipe(
     map(
       userData => {
         sessionStorage.setItem('username', username);
         let authString = 'Basic ' + btoa(username + ':' + password);
         sessionStorage.setItem('basicauth', authString);
         return userData;
       }
     )

     
   );
 }



 
  
baseUrl="http://localhost:8085/userInfo/admin/post";
getTrainUrl="http://localhost:8082/train/trainNo";
deleteUrl="http://localhost:8085/userInfo/admin/deletebyTrainName";
cancelticket="http://localhost:8081/user/ticket";
userbyusername="http://localhost:8083/booking/adminuser";
deletetick="http://localhost:8083/booking/del"
ticketByDate="http://localhost:8083/booking/getuserbydate"
passenger="http://localhost:8083/booking/bookings"

 post(train:any) {
     this.httpClient.post<Train[]>('http://localhost:8085/userInfo/admin/post',train)
     .subscribe(value => console.log(value));
  }
  adminupdate(booking:any) {
    this.httpClient.put<Booking[]>('http://localhost:8083/booking/adminquota',booking)
    .subscribe(value => console.log(value));
 }
  bookTicket(booking:any) {
    this.httpClient.post<Booking[]>('http://localhost:8081/user/bookTicket',booking)
    .subscribe(value => console.log(value));
 }

 getallUsers(){
   return this.httpClient.get<Booking[]>('http://localhost:8083/booking/getalluser')
 }
getticketbyDate(){
  return this.httpClient.get<Booking[]>(`${this.ticketByDate}/${this.username1}`)
}
 cancelTicket(){
 return this.httpClient.get<Booking[]>(`${this.cancelticket}/${this.username1}`)
 }
 getuserbyusername(username:any){
  return this.httpClient.get<Booking[]>(`${this.userbyusername}/${username}`)
  }
deleteticket(pnr:any)
{
return  this.httpClient.delete<Booking[]>(`${this.deletetick}/${pnr}`)
}
passengerticket(trainName:any,date:any)
{
 return  this.httpClient.get<Booking[]>(`${this.passenger}/${trainName}/${date}`)
}
 signUp(user:any)
 {
   this.httpClient.post<User[]>('http://localhost:8081/user/signUp',user)
   .subscribe(value=>console.log(value));
 }

  delete(trainName:any,date:any)
  {
    return this.httpClient.delete(`${this.deleteUrl}/${trainName}/${date}`, { responseType: 'text' });
  }

  getTrainBYTrainNo(train:any){
    return this.httpClient.get<Train>(`${this.getTrainUrl}/${train.trainNo}`);
  }

  makePayment(order:any) {
 
    return this.httpClient.post<Order[]>('http://localhost:9090/pay', order) .subscribe(value=>console.log(value));
    
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
 
}
