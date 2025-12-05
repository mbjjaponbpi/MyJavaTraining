/**
 * 
 */
package com.bea.test;

/**
 * 
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Day 5 activity1
		//M2_ACTIVITY4
		//
		
		Executable excel = new MSExcel();
		
		Executable word = new MSWord();
		
		runProgram(excel);
		runProgram(word);
		
		
		stopProgram(excel);
		stopProgram(word);
		

		
	}
	
	public static void runProgram(Executable executableProgram) {
		executableProgram.run();
	}
	
	public static void stopProgram(Executable executableProgram) {
		executableProgram.stop();
	}

}
