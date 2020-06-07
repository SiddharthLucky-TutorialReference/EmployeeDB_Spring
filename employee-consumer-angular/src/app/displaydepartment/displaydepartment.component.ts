import { Component, OnInit } from '@angular/core';
import {Department} from '../model/department';
import {DepartmentserviceService} from '../service/departmentservice.service';

@Component({
  selector: 'app-displaydepartment',
  templateUrl: './displaydepartment.component.html',
  styleUrls: ['./displaydepartment.component.css']
})
export class DisplaydepartmentComponent implements OnInit {

  departments: any;
  constructor(private departmentservice: DepartmentserviceService) { }

  ngOnInit(): void {
    const resp1 = this.departmentservice.getAllDepartments();
    resp1.then((data: any) => this.departments = data);
  }

}
