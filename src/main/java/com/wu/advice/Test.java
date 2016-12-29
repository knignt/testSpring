package com.wu.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springAdvice.xml");
		CustomerService service = (CustomerService) context.getBean("customerService");
		service.printInfo();
	}
}
