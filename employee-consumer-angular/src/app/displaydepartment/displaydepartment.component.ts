import {Component, OnInit} from '@angular/core';
import {DepartmentserviceService} from '../service/departmentservice.service';
import {Department} from '../department';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-displaydepartment',
  templateUrl: './displaydepartment.component.html',
  styleUrls: ['./displaydepartment.component.css']
})
export class DisplaydepartmentComponent implements OnInit {
  departmentsArray: Observable<Department[]>;
  department: Department;
  constructor(private departmentservice: DepartmentserviceService) { }

  ngOnInit() {
    this.getDepartmentUsingId_Service();
  }

  getDepartmentUsingId_Service(){
    /*this.departmentsArray = this.departmentservice.getAllDepartments();*/
    this.departmentservice.getDepat_ById()
      .subscribe((data: Department) => this.department = data);
    console.log('Resultant department ' + this.department);
  }
}
