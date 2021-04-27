import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { LoginServiceService } from './login-service.service';
import { Train } from './train';
import { TrainServiceService } from './train-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


public show=true;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: LoginServiceService) {   }

  ngOnInit() {
    
    this.show=false

  }


 login(){
  this.router.navigate(['/login']);
  this.show=false;
  }

}