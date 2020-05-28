package lucky.restapi.departmentinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "lucky.restapi.departmentinfoservice.repository")
@SpringBootApplication
public class DepartmentInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentInfoServiceApplication.class, args);
	}

}
