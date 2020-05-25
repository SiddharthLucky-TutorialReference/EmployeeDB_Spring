package lucky.restapi.employeeinfoservice.repository;

import lucky.restapi.employeeinfoservice.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeInterface extends CrudRepository<Employees, Long>
{

}
