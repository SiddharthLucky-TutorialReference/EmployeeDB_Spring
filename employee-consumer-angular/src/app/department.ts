export class Department {
  deptno: string;
  deptname: string;
  constructor(department: Department) {
    Object.assign(this, department)
  }
}
