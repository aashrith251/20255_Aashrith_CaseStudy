import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
    providedIn:'root'
})
export class UserService{
    private baseUrl = "http://localhost:8080/user";

    constructor(private httpClient:HttpClient){ }

    getUserList():Observable<any>{
        return this.httpClient.get(this.baseUrl);
    }
    createUser(user :Object):Observable<Object>{
        return this.httpClient.post(this.baseUrl,user);
    }
    deleteUser(id:number):Observable<any>{
        return this.httpClient.delete(  `${this.baseUrl}/${id}`,{responseType:'text'});
    }
    UpdateUser(id:number,value:any):Observable<Object>{
        return this.httpClient.put(`${this.baseUrl}/${id}`,value);
    }
    getUser(id:number):Observable<any>{
        return this.httpClient.get(`${this.baseUrl}/${id}`);
    }
}