package com.abhinavraj.demo;

import org.assertj.core.api.Assertions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
	
	public void shouldCheck() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LifeCycle lcBean = appContext.getBean(LifeCycle.class);
		Assertions.assertThat(lcBean).isNotNull();
		Assertions.assertThat(lcBean.isInitialized()).isTrue();
	}

}
