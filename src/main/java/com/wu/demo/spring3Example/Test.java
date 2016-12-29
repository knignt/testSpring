package com.wu.demo.spring3Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wu.demo.spring3Example.loosely_coupled.OutputHelper;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("springBeans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.print();
		
		
		/*context = new ClassPathXmlApplicationContext("spring-output.xml");
		OutputHelper helper = (OutputHelper) context.getBean("outputHelper");
		helper.generatorOutput();*/
	}
}
