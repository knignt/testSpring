package com.wu.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wu.component.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springStudent.xml");
		StudentService service = (StudentService) context.getBean("studentService");
		System.out.println(service);
	}
}	
