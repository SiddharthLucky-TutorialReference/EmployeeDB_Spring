package lucky.restapi.employeerestcaller.controller;

import lucky.restapi.employeerestcaller.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RestController
@RequestMapping("/employees")
public class EmployeeCallerController
{
    private RestTemplate restTemplate;

    @Autowired
    public EmployeeCallerController(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{empId}")
    public Employees getEmployeeDetails_Id(@PathVariable("empId") long empid)
    {
        Employees employees = restTemplate.getForObject("http://localhost:8083/employees/"+empid, Employees.class);
        return employees;
    }
}
