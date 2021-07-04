import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogInComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserlistshowComponent } from './userlistshow/userlistshow.component';

const routes: Routes = [
  {path:'', component: LogInComponent},
  {path:'reg', component: RegisterComponent},
  {path: 'userlistshow',component: UserlistshowComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
