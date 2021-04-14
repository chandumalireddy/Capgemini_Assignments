import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-admin-menu',
  templateUrl: './admin-menu.component.html',
  styleUrls: ['./admin-menu.component.css']
})
export class AdminMenuComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: LoginServiceService) {   }
  ngOnInit(): void {
  }
addTrain(){
  this.router.navigate(['/adminmenu/addtrain']);
}
logout(){
  this.authenticationService.logOut();
}
deleteTrain(){
  this.router.navigate(['/adminmenu/deletetrain']);
}

}
