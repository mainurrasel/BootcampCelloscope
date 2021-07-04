import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserCreation } from './userlistshow/userlistshow.model';

@Injectable({
  providedIn: 'root',
})
export class UserlistshowService {
  constructor(private http: HttpClient) {}

  getData() {
    let url = 'http://localhost:8080/api/v1/get';
    return this.http.get<UserCreation[]>(url);
  }
  deleteData(uid: any) {
    const url = 'http://localhost:8080/api/v1/delete/' + uid;
    return this.http.delete(url);
  }
  updateData(uid: any, updatedBody:any){
    const endpointURL= 'http://localhost:8080/api/v1/update/' + uid;
    return this.http.put(endpointURL,updatedBody)
  }
  
}
