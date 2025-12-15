package com.bea.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> productList = new ArrayList<>();

		productList.add("Laptop");
		productList.add("Mouse");
		productList.add("Keyboard");
		productList.add("Monitor");
		productList.add("Printer");
		
		printAllProducts(productList);
		
		productList = addProduct(productList);
		searchProduct(productList);
		
	}
	
	
	
	static void listProducts(List<String> productList) {
		for (int i = 0; i < productList.size(); i++) {
			System.out.println((i + 1) + ". " + productList.get(i));
		}
	}
	
	static void printAllProducts (List<String> productList) {
		System.out.println("\nAll products:");
		listProducts(productList);
	}
	

	static List<String> addProduct (List<String> productList) {
		
		System.out.println("\nAfter adding and removing products:");
		productList.add("Webcam");
		productList.remove("Mouse");
		listProducts(productList);
		return productList;
	}
	
	
	static void searchProduct (List<String> productList) {
		Scanner input = new Scanner(System.in);
		
		System.out.print ("\nEnter product name to search: ");

		String strSearch = input.nextLine();   //whole line

		if (productList.contains(strSearch)) {
			System.out.println("Product found: " + strSearch);
			
		} else {
			System.out.println("Product not found");
			
		}
			
	}


}
