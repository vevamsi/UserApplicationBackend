package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;
@ContextConfiguration(classes = UserLoginApplication.class)
@SpringBootTest
class UserLoginApplicationTests {
	@Autowired
    EmployeeRepo er;
	@Test
	void saveEmployee() {
		Employee e=new Employee();
		e.setEmployeename("harry");
		e.setEmail("harry@gmail.com");
		e.setPassword("5555");
		er.save(e);
		assertNotNull(er.findByEmail("harry@gmail.com"));
	}

}
