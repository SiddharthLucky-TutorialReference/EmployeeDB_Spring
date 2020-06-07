package lucky.restapi.departmentinfoservice.controller;

import lucky.restapi.departmentinfoservice.model.Departments;
import lucky.restapi.departmentinfoservice.repository.DepartmentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/departments")
public class DepartmentController
{
    @Autowired
    DepartmentInterface departmentInterface;

    @GetMapping("/all")
    public List<Departments> getAllDepartments()
    {
        return departmentInterface.findAll();
    }

    @PostMapping(value = "/add-departments")
    public String addIntoDepartments(@RequestBody Departments department)
    {
        departmentInterface.save(department);
        return "Value added Successfully";
    }


    @DeleteMapping(value ="/remove-department/{dept_id}")
    public String removeDepartmentId(@PathVariable("dept_id") String dept_Id)
    {
        departmentInterface.deleteById(dept_Id);
        return "The value is deleted successfully";
    }
}
