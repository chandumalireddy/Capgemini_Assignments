import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';  
import { Train } from './train';

@Injectable({
  providedIn: 'root'
})
export class TrainServiceService {
 
  private url='http://localhost:8082/train/allTrains';
  private url1='http://localhost:8082/train/trainNo';
  private url2='http://localhost:8082/train/getTrainRoute';
  private url3='http://localhost:8082/train/getTrainRouteWithDate';
  private url4="http://localhost:8082/train/getTrainNameWithDate"
  private url5="http://localhost:8082/train/getStationTimeTable"
  private url6="http://localhost:8082/train/update"
  constructor(private http:HttpClient) { }

  getTrian(): Observable<any> {
    return this.http.get<Train[]>(this.url);
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
  getTrainByTrainNameWithDate(trainName:any,date:any): Observable<any> {
    return this.http.get(`${this.url4}/${trainName}/${date}`);  
  }
  getstationtt(source:any,date:any): Observable<any> {
    return this.http.get(`${this.url5}/${source}/${date}`);  
  }
  updatetrain(train:any): Observable<any>{
   return this.http.put('http://localhost:8082/train/update', train);
  }
}

