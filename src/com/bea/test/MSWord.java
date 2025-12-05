package com.bea.test;

public class MSWord extends Executable {

	public MSWord () {
		//inherits ExecutableJava
		super();
		
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word");
	}

	@Override
	public void run() {
		System.out.println("Opening MS Word");
	}

}
