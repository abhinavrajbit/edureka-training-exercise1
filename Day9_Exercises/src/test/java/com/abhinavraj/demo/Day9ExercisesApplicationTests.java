package com.abhinavraj.demo;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abhinavraj.demo.day9.Employee;
import com.abhinavraj.demo.day9.EmployeeRepository;

@SpringBootTest
class Day9ExercisesApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
		Employee emp = Employee.builder().id(1).firstName("john").lastName("lee").build();
		
		employeeRepository.save(emp);
		Optional<Employee> emp1 = employeeRepository.findById(1);
		Assertions.assertThat(emp1.isPresent()).isTrue();
		Assertions.assertThat(emp1.get()).isEqualTo(emp);
		
	}

}
