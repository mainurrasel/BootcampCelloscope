import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent{
  constructor(private http:HttpClient, private route:Router){}
  onSubmit(data:any)
  {
    this.http.post('http://localhost:8080/api/v1/add',data)
    .subscribe((result)=>{
      console.warn("result",result)
      this.route.navigate(['/userlistshow']);
    })
    

console.warn(data);
  }
}