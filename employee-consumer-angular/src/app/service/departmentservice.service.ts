import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Department} from '../department';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DepartmentserviceService {

  constructor(private http: HttpClient) { }

  getAllDepartments(): Observable<any> {
    return this.http.get('http://localhost:8084/departments/all');
  }

  getDepat_ById(): Observable<Department> {
    return this.http
      .get<Department>('http://localhost:8084/departments/department/d001')
      .pipe(map((response: Department) => { console.log('Printing from service '+response[0]);
                                            return new Department(response);
      }));
  }
}
