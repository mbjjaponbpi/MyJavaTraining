package com.bea.test;


//inherits ExecutableJava
public class MSWord extends Executable {

	//constructor
	public MSWord () {
		super();
		
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
	}

	@Override
	public void run() {
		System.out.println("Opening MS Word...");
	}

}
