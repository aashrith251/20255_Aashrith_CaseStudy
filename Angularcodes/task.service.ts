import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
    providedIn:'root'
})
export class TaskService{
    private baseUrl = "http://localhost:8080/task";

    constructor(private httpClient:HttpClient){ }

    getTaskList():Observable<any>{
        return this.httpClient.get(this.baseUrl);
    }
    createTask(task :Object):Observable<Object>{
        return this.httpClient.post(this.baseUrl,task);
    }
    deleteTask(id:number):Observable<any>{
        return this.httpClient.delete(  `${this.baseUrl}/${id}`,{responseType:'text'});
    }
    UpdateTask(id:number,value:any):Observable<Object>{
        return this.httpClient.put(`${this.baseUrl}/${id}`,value);
    }
    getTask(id:number):Observable<any>{
        return this.httpClient.get(`${this.baseUrl}/${id}`);
    }
}