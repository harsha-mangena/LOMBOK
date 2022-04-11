package com.learning.lombok;

import com.DTO.Employee;
import com.DTO.EmployeeWithLombok;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LombokApplication.class, args);
		System.out.println("With out Lombok");
		Employee emp1 = new Employee(123, true, 1, (long) 96385274, (float)100000);
		System.out.println(emp1.toString());
		
		// System.out.println(emp1.getId());
		// System.out.println(emp1.getSalary());
		// emp1.setNumber(12345678);
		// System.out.println(emp1.getNumber());

		System.out.println("After removal of boiler plate code with LOMBOK");
		EmployeeWithLombok employee1 = new EmployeeWithLombok(132, false, 10, (long)456231, (float)2000000);
		System.out.println(employee1.toString());
		//setting salary to  null
		emp1.setSalary(null);

	}

}
