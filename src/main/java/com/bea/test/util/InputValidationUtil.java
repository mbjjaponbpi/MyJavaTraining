package com.bea.test.util;

import java.util.Scanner;

import com.bea.test.M5_Activity3.Constants;

public class InputValidationUtil {

	public String validateInput(Scanner input, String prompt, boolean checkIsInteger, boolean checkIsDouble) {
		String ret = null;
		String tempInput;
    	boolean isValid = false;
    	
        do {
        	System.out.print(prompt);
            tempInput = input.nextLine().trim();
            
        	//check the input
        	if ((tempInput == null) || (tempInput == "") ) {
        		System.out.print (Constants.ERROR_INVALID_INPUT);
        	} else {
        		if (checkIsInteger || checkIsDouble) {
        			if (checkIsDouble) {
            			if (!StringUtil.isDouble(tempInput)) {
                    		System.out.print (Constants.ERROR_INVALID_INPUT);
            			} else {
	    	    			//valid input
	    	    			ret = tempInput;
	    	    			isValid = true;
	    	        		break;
            			}
        			} else {
	        			if (!StringUtil.isNumeric(tempInput)) {
	                		System.out.print (Constants.ERROR_INVALID_INPUT);
	        			} else {
	    	    			//valid input
	    	    			ret = tempInput;
	    	    			isValid = true;
	    	        		break;
	        			}
        			}
        		} else {
	    			//valid input
	    			ret = tempInput;
	    			isValid = true;
	        		break;
        		}
        	}

        } while (!isValid);

    	return ret;
		
	}
	
}
