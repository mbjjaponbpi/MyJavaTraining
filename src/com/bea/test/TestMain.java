package com.bea.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> productList = new HashSet<>();

		productList.add("Laptop");
		productList.add("Mouse");
		productList.add("Keyboard");
		productList.add("Monitor");
		productList.add("Printer");

		
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
	        		searchProduct(productList, input);
	                break;
	
	            case '2': //add a product
	        		productList = addProduct(productList, input);
	                break;
	
	            case '3': //print all products and count
	            	System.out.println("\nAll products:");
	            	listProducts(productList);
	                break;
	
	            case '4': //exit
	                System.out.println("Exiting...");
	                break;

	            default:
	                System.out.println("Invalid option!");
	                
            } // end of switch statement

        } while (option != '4');
        

        //close the Scanner
        input.close();

        
	}
	
	static void displayMenu() {
		System.out.println
		("\n " +
		"\n ********************* WELCOME TO PRODUCT SYSTEM *********************" + 
		"\n *                                                                   *" + 
		"\n *  [1] Search a product                                             *" + 
		"\n *  [2] Add a product                                                *" + 
		"\n *  [3] Print all products and count                                 *" + 
		"\n *  [4] Exit                                                         *" + 
		"\n *                                                                   *" + 
		"\n *********************************************************************"  
		);
	}
	
	//option 1
	static void searchProduct (Set<String> productList, Scanner input) {
		System.out.print ("\nEnter product name to search: ");
		String strSearch = input.nextLine();   //whole line

		if (productList.contains(strSearch)) {
			System.out.println("Product found: " + strSearch);
		} else {
			System.out.println("Product not found!");
		}
	}

	//option 2
	static Set<String> addProduct (Set<String> productList, Scanner input) {
		System.out.print("\nEnter product name to add: ");
		String strAddItem = input.nextLine();   //whole line
		productList.add(strAddItem);
		System.out.println("Product added: " + strAddItem);
		return productList;
	}
	
	//option 3
	static void listProducts(Set<String> productList) {
		for (String product : productList) {
			System.out.println(product);
		}
		System.out.println("Total unique products: " + productList.size());
	}



}
