package com.wu.demo.spring3Example.loosely_coupled;

public class OutputHelper {
	
	IOutputGenerator generator;

	public IOutputGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(IOutputGenerator generator) {
		this.generator = generator;
	}
	
	public void generatorOutput(){
		this.generator.generateOutput();
	}
}
