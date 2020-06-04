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
    @Column(name = "dept_no", nullable = false, columnDefinition = "VARCHAR(4)")
    private String dept_No;

    @Column(name = "dept_name", unique = true, columnDefinition = "VARCHAR(40)")
    private String dept_Name;
}
