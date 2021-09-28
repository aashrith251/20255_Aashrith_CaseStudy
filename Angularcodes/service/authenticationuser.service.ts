import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../User';
import { UserService } from '../user.service';
@Injectable({
  providedIn: 'root'
})
export class AuthenticationuserService {
  user!:Observable<User[]>
  test : Boolean=false;
  b:Boolean=false;
  constructor(private proService:UserService) { }
   
  authenticate(username: string, password: string,test : Boolean) {
    this.proService.getUserList().subscribe(clientData => {
      const r= Object.assign(new User(), clientData);
       
       const u=clientData.find((a: { userId: number; })=>{
         return a.userId===Number(username)
       })
       console.log(u.password)
       console.log(u)
       if(password===u.password){
         sessionStorage.setItem('username', "javainuse1")
         this.test=true;
       }
    } )
   return this.test;
  }
   isadmin()
     {
        return this.b;
     }
  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
}
