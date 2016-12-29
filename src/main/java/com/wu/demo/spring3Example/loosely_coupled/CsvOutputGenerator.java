package com.wu.demo.spring3Example.loosely_coupled;

public class CsvOutputGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		System.out.println("creating CsvOutputGenerator output...");
	}

}
