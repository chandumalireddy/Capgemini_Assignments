import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';
import { Train } from '../train';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],

})
export class LoginComponent implements OnInit {

  show=false;
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
  train:Train[]=[];
  login(username:any,password:any){
    
   console.log(username);
   this.username=username;
   this.password=password;
    this.authenticationService.authenticate(this.username, this.password).subscribe((result)=> {
      console.log(result)
      this.show=true;
      this.invalidLogin = false;
      this.loginSuccess = true;
      this.router.navigate(['/adminmenu']); 
    
    }, () => {
      console.log("not credentials")
      this.invalidLogin = true;
      this.loginSuccess = false;
    });   
   
     

     

  }
  addTrain(){
    this.router.navigate(['/adminmenu/addtrain']);
  }
  logout(){
    this.authenticationService.logOut();
  }   
 
  }




