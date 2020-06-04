package lucky.restapi.employeeinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees", schema = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employees
{
  @Id
  /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
  private int emp_no;
  private Date birth_date;
  private String first_name;
  private String last_name;
  public enum Gender {
    M, F
  }
  @Enumerated(EnumType.STRING)
  private Gender gender;
  private Date hire_date;

}
