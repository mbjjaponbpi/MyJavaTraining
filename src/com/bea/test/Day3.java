package com.bea.test;

public class Day3 {

	public void runday3activity1() {
		
		//***** ACTIVITY 6 *****:
		Book book1 = new Book();
		book1.author = "JK Rowling";
		book1.title = "Harry Potter and the Chamber of Secrets";
		
		book1.scanBook();
		book1.getPublisher();
		book1.getAuthor();
		book1.getTitle();
		
		System.out.println();
		House house1 = new House();
		house1.getHouseNumber();
		house1.getHouseColor();
		house1.getHouseType();
		
		System.out.println();
		Tree tree1 = new Tree();
		tree1.setName("Mango");
		tree1.setLeafType("Broad");
		tree1.setHeightInches(30);
		tree1.getTreeProperties();
		
	}
	
}
