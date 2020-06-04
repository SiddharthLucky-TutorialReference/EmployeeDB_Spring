package lucky.restapi.employeeinfoservice.repository;

import lucky.restapi.employeeinfoservice.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeInterface extends JpaRepository<Employees, Integer>
{

}
