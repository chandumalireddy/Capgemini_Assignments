import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Train } from './train';
import { map } from 'rxjs/operators';
import { Booking } from './booking';
import { User } from './user';


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

 post(train:any) {
     this.httpClient.post<Train[]>('http://localhost:8085/userInfo/admin/post',train)
     .subscribe(value => console.log(value));
  }
  bookTicket(booking:any) {
    this.httpClient.post<Booking[]>('http://localhost:8081/user/bookTicket',booking)
    .subscribe(value => console.log(value));
 }

 cancelTicket(){
 return this.httpClient.get<Booking[]>(`${this.cancelticket}/${this.username1}`)
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

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
 
}
