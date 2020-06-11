import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Department } from '../model/department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  constructor(private httpClient: HttpClient) { }

  getDepartmentId_Service(): Observable<Department>
  {
    return this.httpClient.get<Department>('http://localhost:8084/departments/department/d001');
  }
}
