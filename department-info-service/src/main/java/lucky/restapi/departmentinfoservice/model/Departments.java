package lucky.restapi.departmentinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "departments", schema = "employees")
public class Departments
{
    @Id
    @GeneratedValue
    private String dept_No;

    private String dept_Name;
}
