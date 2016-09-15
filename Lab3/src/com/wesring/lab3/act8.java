package com.wesring.lab3;

import java.util.Scanner;

/*
 * Code fixed by
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 * I'm sorry it still looks so bad, I'm just doing as I am told
 */

public class act8 {

	public static void main(String[] args) {
		
		//---- Declare all the variables here
		int choice = 0, num = 0;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		final double tax = 1.023;
		
		
		System.out.println("Please select 1 of the following options to buy: ");
		System.out.println("1. Shirts (7$ / item)");
		System.out.println("2. Pants  (10$ / item)");
		System.out.println("3. Top    (5$ / item)");
		
		//On the next line, write the code to scan an integer called choice. Use the necessary input
		choice = scan.nextInt();
		if(choice == 1)
		{
			//Here, ask the user how many shirts they would like to buy. Based on that quantity and the price per shirt, calculate the total.
			System.out.println("How many shirts you want, mate?");
			total = (scan.nextInt() * 7.0);
			System.out.println("total before tax: " + total);
		}
		else if(choice == 2)
		{
			//Here, ask the user how many pants they would like to buy. Based on that quantity and the price per pants, calculate the total.	
			System.out.println("How many pants you want, mate?");
			total = (scan.nextInt() * 10.0);
			System.out.println("total before tax: " + total);
		}
		else if(choice == 3)
		{
			//Here, ask the user how many top they would like to buy. Based on that quantity and the price per top, calculate the total.
			System.out.println("How many tops you want, mate?");
			total = (scan.nextInt() * 5.0);
			System.out.println("total before tax: " + total);

		}	
		total = total * tax;
		
		System.out.println("Hello Customer, Thank you for your purchase at our store.");
		// below, write the code to print the total bill
		System.out.println("Your total bill was : "+ total);
		
	}

}
