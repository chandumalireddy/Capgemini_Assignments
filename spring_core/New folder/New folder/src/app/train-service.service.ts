import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';  

@Injectable({
  providedIn: 'root'
})
export class TrainServiceService {
 
  private url='http://localhost:8082/train/allTrains';
  private url1='http://localhost:8085/trainInfo/train/trainNo';
  private url2='http://localhost:8082/train/getTrainRoute';
  private url3='http://localhost:8082/train/getTrainRouteWithDate';
  constructor(private http:HttpClient) { }

  getTrian(): Observable<any> {
    return this.http.get(this.url);
  }
  getTrainByTrainNo(trainNo:any): Observable<any> {
    return this.http.get(`${this.url1}/${trainNo}`);  
  }
  getTrainByTrainFromSourceToDestination(trainSource:any,trainDestination:any): Observable<any> {
    return this.http.get(`${this.url2}/${trainSource}/${trainDestination}`);  
  }
  getTrainByTrainFromSourceToDestinationWithDate(trainSource:any,trainDestination:any,date:any): Observable<any> {
    return this.http.get(`${this.url3}/${trainSource}/${trainDestination}/${date}`);  
  }
}

