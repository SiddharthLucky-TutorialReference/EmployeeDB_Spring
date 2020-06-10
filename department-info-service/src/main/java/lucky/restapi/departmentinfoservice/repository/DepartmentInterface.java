package lucky.restapi.departmentinfoservice.repository;

import lucky.restapi.departmentinfoservice.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentInterface extends JpaRepository<Departments, String>
{

}
