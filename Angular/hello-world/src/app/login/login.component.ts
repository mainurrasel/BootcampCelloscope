import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LogInComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  uid: string = '';
  password: string = '';

  uid1: string = '';
  password1: string = '';


  clickme() {
   this.uid1 = this.uid;
   this.password1 = this.password;
  }
}
