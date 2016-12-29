package com.wu.advice;

public class CustomerService {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void printInfo(){
		System.out.println("Customer name:"+this.name);
	}
}
