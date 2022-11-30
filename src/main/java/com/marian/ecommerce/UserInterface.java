package com.marian.ecommerce;

import java.util.Scanner;

public class UserInterface {
		
	static Scanner sc = new Scanner(System.in);

	public static int menuMain() {
		int option = 0;
		do {
			System.out.println("Main MENU");
			System.out.println("==================");
			System.out.println("0] Exit");
			System.out.println("1] Shop");
			System.out.println("==================");
			option = sc.nextInt();
			sc.nextLine();
		} while (option < 0 || option > 2);
		return option;
	}

	public static int menuAdmin() {
		int option = 0;
		do {
			System.out.println("MENU");
			System.out.println("==================");
			System.out.println("0] Back to Main Menu");
			System.out.println("1] Add product");
			System.out.println("2] See all products");
			System.out.println("3] Update a product");
			System.out.println("4] Remove a product");			
			System.out.println("==================");
			option = sc.nextInt();
			sc.nextLine();
		} while (option < 0 || option > 4);
		return option;
	}

}


