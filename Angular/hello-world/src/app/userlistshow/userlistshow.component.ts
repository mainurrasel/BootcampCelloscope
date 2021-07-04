import { Component, OnInit } from '@angular/core';
import { UserlistshowService } from '../userlistshow.service';
@Component({
  selector: 'app-userlistshow',
  templateUrl: './userlistshow.component.html',
  styleUrls: ['./userlistshow.component.css'],
})
export class UserlistshowComponent implements OnInit {
  title = 'User Creation';
  data: any;
  constructor(private userService: UserlistshowService) {}

  ngOnInit(): void {
    this.userService.getData().subscribe((data) => {
      console.log('data from user list show: ' + data);
      this.data = data;
      console.log(this.data);
    });
  }

  deleteUser(uid: any) {
    this.userService.deleteData(uid).subscribe((data) => {
      console.log('Data Deleted');
      this.ngOnInit();
    });
  }
}
