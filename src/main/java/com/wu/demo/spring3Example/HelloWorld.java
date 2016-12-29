package com.wu.demo.spring3Example;

public class HelloWorld {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print(){
		System.out.println("hello "+name);
	}
	
}
