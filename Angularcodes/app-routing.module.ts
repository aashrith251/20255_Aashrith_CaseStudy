import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTaskComponent } from './create-task/create-task.component';
import { TaskListComponent } from './task-list/task-list.component';
import { UpdateTaskComponent } from './update-task/update-task.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { UserListComponent } from './user-list/user-list.component';
import { LogoutComponent } from './logout/logout.component';
import { LoginComponent } from './login/login.component';
import { AuthGaurdService } from './service/auth-gaurd.service';
import { LoginuserComponent } from './loginuser/loginuser.component';
const routes: Routes = [
  {path:'',redirectTo:'Task',pathMatch:'full'},
  {path:'tasks',component:TaskListComponent,canActivate:[AuthGaurdService] },
  {path:'save',component:CreateTaskComponent,canActivate:[AuthGaurdService] },
  {path:'update/:id',component:UpdateTaskComponent,canActivate:[AuthGaurdService] },
  {path:'newuser',component:CreateUserComponent,canActivate:[AuthGaurdService] },
  {path:'users',component:UserListComponent,canActivate:[AuthGaurdService] },
  {path:'logout',component:LogoutComponent,canActivate:[AuthGaurdService] },
  {path:'login',component:LoginComponent},
  {path:'loginuser',component:LoginuserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
