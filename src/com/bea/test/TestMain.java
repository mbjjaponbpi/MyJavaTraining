package com.bea.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> productMap = new HashMap<>();

		productMap.put("Laptop", 50000.00);
		productMap.put("Mouse", 3000.00);
		productMap.put("Keyboard", 2000.00);
		productMap.put("Monitor", 5000.00);
		productMap.put("Printer", 7500.00);

		
        Scanner input = new Scanner(System.in);
    	String tempInput;

    	char option;
        do {
        	
        	displayMenu();
        	System.out.print("> ");
        	tempInput = input.nextLine().trim();

        	
        	//check the encoded option
        	if ((tempInput == null) || (tempInput.length() != 1) ) {
        		//set to 0 to make it an invalid choice
        		option = "0".charAt(0);
        	} else {
        		option = tempInput.charAt(0);
        	} 
        	
        	//check option
            switch (option) {
	            case '1': //search a product
	        		searchProduct(productMap, input);
	                break;
	
	            case '2': //add a product
	        		productMap = addProduct(productMap, input);
	                break;
	
	            case '3': //print all products and count
	            	System.out.println("\nAll products:");
	            	listProducts(productMap);
	                break;
	
	            case '4': //
                	findCheapestProduct(productMap);
                	break;

	            case '5': //exit
	                System.out.println("Exiting...");
	                break;

	            default:
	                System.out.println("Invalid option!");
	                
            } // end of switch statement

        } while (option != '5');
        

        //close the Scanner
        input.close();

        
	}
	
	static void displayMenu() {
		System.out.println
		("\n " +
		"\n ********************* WELCOME TO PRODUCT SYSTEM *********************" + 
		"\n *  [1] Search a product                                             *" + 
		"\n *  [2] Add a product                                                *" + 
		"\n *  [3] Print all products and count                                 *" + 
		"\n *  [4] Find the cheapest product                                    *" + 
		"\n *  [5] Exit                                                         *" + 
		"\n *********************************************************************"  
		);
	}
	
	//option 1
	static void searchProduct (Map<String, Double> productMap, Scanner input) {
		System.out.print ("\nEnter product name to search: ");
		String strSearch = input.nextLine();   //whole line

		if (productMap.containsKey(strSearch)) {
			System.out.println("Product found! price: " + productMap.get(strSearch));
		} else {
			System.out.println("Product not found!");
		}
	}

	//option 2
	static Map<String, Double> addProduct (Map<String, Double> productMap, Scanner input) {
		System.out.print("\nEnter product name to add: ");
		String strAddItemName = input.nextLine();   //whole line
		System.out.print("\nEnter product price to add: ");
		Double strAddItemPrice = Double.valueOf(input.nextLine());   //whole line
		
		productMap.put(strAddItemName, strAddItemPrice);
		System.out.println("Product added: " + strAddItemName + " - " + strAddItemPrice );
		return productMap;
	}
	
	//option 3
	static void listProducts(Map<String, Double> productMap) {
		for (Map.Entry<String, Double> product : productMap.entrySet()) {
			System.out.println(product.getKey() + " - " + product.getValue());
		}
		System.out.println("Total products: " + productMap.size());
	}

	
	//option 4
	static void findCheapestProduct(Map<String, Double> productMap) {
		ArrayList<Double> list = new ArrayList<>(productMap.values());
		Collections.sort(list);
		
		for (Map.Entry<String, Double> product : productMap.entrySet()) {
			if (product.getValue() == list.get(0)) {
				System.out.println("Cheapest product: " + product.getKey() + " - " + product.getValue());
				break;
			}
			//System.out.println(minValue);
		}
	}
	
	
	

}
