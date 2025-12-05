package com.bea.test;

public class MSExcel extends Executable {

	
	public MSExcel () {
		//inherits ExecutableJava
		super();
		
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Excel...");
	}

	@Override
	public void run() {
		System.out.println("Opening MS Excel...");
	}

}
