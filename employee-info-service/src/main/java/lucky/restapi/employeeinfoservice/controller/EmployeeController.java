package lucky.restapi.employeeinfoservice.controller;

import lucky.restapi.employeeinfoservice.model.Employees;
import lucky.restapi.employeeinfoservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/{empId}")
    public Employees getEmployeeById(@PathVariable("empId") Long empId)
    {
        Optional<Employees> employee = employeeService.getAnEmployee_Id(empId);

        return employee.get();
    }

    @GetMapping("/all")
    public List<Employees> getAllEmployees()
    {
        List<Employees> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }
}
