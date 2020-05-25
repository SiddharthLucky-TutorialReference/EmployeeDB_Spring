package lucky.restapi.departmentinfoservice.controller;

import lucky.restapi.departmentinfoservice.model.Departments;
import lucky.restapi.departmentinfoservice.repository.DepartmentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@Controller
@RestController
@RequestMapping("/departments")
public class DepartmentController
{
    private final DepartmentInterface departmentInterface;

    @Autowired
    public DepartmentController(DepartmentInterface departmentInterface) {
        this.departmentInterface = departmentInterface;
    }

    @GetMapping("/all")
    public List<Departments> getAllDepartments()
    {
        List<Departments> allDepartments = (List<Departments>) departmentInterface.findAll();
        return allDepartments;
    }
}
