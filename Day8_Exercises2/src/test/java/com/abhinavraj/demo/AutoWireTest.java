package com.abhinavraj.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhinavraj.demo.question1.Company;

public class AutoWireTest {
	
	@Test
	public void byNameDemo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Company company = applicationContext.getBean("com_by_name",Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
	
	@Test
	public void byTypeDemo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Company company = applicationContext.getBean("com_by_type",Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
	
	@Test
	public void byConstructorDemo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Company company = applicationContext.getBean("com_by_constructor",Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}

}
