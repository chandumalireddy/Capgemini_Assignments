import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';
import { User } from '../user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
show=false

user=new User('','','','');
  constructor(
    private route: ActivatedRoute,
    private router: Router, private authenticationService: LoginServiceService) {   }
    username:any;
    password:any;
    errorMessage = 'Invalid Credentials';
    successMessage: any;
    invalidLogin = false;
    loginSuccess = false
  ngOnInit(): void {
  }
  login(username:any,password:any){
    
    console.log(username);
    this.username=username;
    this.password=password;
     this.authenticationService.authenticateUser(this.username, this.password).subscribe((result)=> {
       console.log(result)
       this.invalidLogin = false;
       this.loginSuccess = true;
       this.router.navigate(['/userMenu']); 
     
     }, () => {
       this.invalidLogin = true;
       this.loginSuccess = false;
     });   
  
   }
signUp(){
  this.show=true;
}
   onsubmit(val: any)
   {
     console.log(val);
    this.user=val;
    this.user.role="ROLE_USER";
    this.authenticationService.signUp(this.user);
   }
  }
