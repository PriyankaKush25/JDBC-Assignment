package com.assignment.JDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
		EmployeeJDBC crud = new EmployeeJDBC();
		Employee e1 = new Employee(1, "Priyanka", "SWE");
		Employee e2 = new Employee(2, "Aditi", "Data Science");
		crud.addEmployee(e1);
		crud.addEmployee(e2);
		crud.viewEmployees();
		crud.updateEmployee(1, "Govind", "Marketing");
		crud.deleteEmployee(2);
		crud.viewEmployees();
	}

}
