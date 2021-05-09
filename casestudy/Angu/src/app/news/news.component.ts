import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Data } from '@angular/router';
import { Observable } from 'rxjs';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  title = 'Covid19-India-Tracker';  
 news:Data[]=[]
  
  constructor(private service: LoginServiceService) { }  
  
  ngOnInit() { 
    

  }  
  
  
 
}  