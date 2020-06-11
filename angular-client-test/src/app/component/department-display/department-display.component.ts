import { Department } from './../../model/department';
import { Component, OnInit } from '@angular/core';
import { DepartmentService } from 'src/app/service/department.service';

@Component({
  selector: 'app-department-display',
  templateUrl: './department-display.component.html',
  styleUrls: ['./department-display.component.css']
})
export class DepartmentDisplayComponent implements OnInit {
  department: any;
  constructor(private departmentService: DepartmentService) { }

  ngOnInit(): void {
    this.getDepartmentByID();
  }

  getDepartmentByID(){
    this.department = this.departmentService.getDepartmentId_Service().subscribe(res => {
      console.log('Printing in console '+res.toString);
      console.log('Printing value in the result '+ res['dept_Name']);
      this.department.deptno = res['dept_No'];
      this.department.deptname = res['dept_Name'];
    });
  }
}
