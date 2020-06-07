import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Department} from '../model/department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentserviceService {

  constructor(private http: HttpClient) { }

  public getAllDepartments() {
    return this.http.get('http://localhost:8084/departments/all')
      .toPromise().then();
  }
}
