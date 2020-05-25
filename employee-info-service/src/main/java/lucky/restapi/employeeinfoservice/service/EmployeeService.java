package lucky.restapi.employeeinfoservice.service;

import java.util.*;

import lucky.restapi.employeeinfoservice.model.Employees;
import lucky.restapi.employeeinfoservice.repository.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    private EmployeeInterface employeeInterface;

    @Autowired
    public EmployeeService(EmployeeInterface employeeInterface)
    {
        this.employeeInterface = employeeInterface;
    }

    public List<Employees> getAllEmployees()
    {
        return (List<Employees>) employeeInterface.findAll();
    }

    public Optional<Employees> getAnEmployee_Id(long empId)
    {
        return employeeInterface.findById(empId);
    }
}
