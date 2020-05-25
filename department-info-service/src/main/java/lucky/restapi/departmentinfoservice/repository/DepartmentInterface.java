package lucky.restapi.departmentinfoservice.repository;

import lucky.restapi.departmentinfoservice.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentInterface extends JpaRepository<Departments, String>
{

}
