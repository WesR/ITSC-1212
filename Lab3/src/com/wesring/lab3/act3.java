package com.wesring.lab3;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 */
public class act3 {
	public static void main(String[] args) {
		final double salesTax = 1.046; // Define the sales tax
		Scanner userInput = new Scanner(System.in); // Define the scanner

		double userBill;// Define the users bill
		double userDiscount;// Define the users discount

		System.out.print("Please input your bill total \n>"); // Prompt the user
		userBill = userInput.nextDouble();

		System.out.print("Please input your membership code \n>"); // Prompt the user
		switch (userInput.nextInt()) {// Grab the user input
		case 2014:
			System.out.println("You get a 15% discount");
			userDiscount = 0.85;
			break;
		case 2015:
			System.out.println("You get a 10% discount");
			userDiscount = 0.90;
			break;
		case 2016:
			System.out.println("You get a 5% discount");
			userDiscount = 0.95;
			break;
		default:
			System.out.println("You get no discount");// just in case
			userDiscount = 1.0;
			break;
		}
		
		System.out.println("Your total bill is $" + ((userBill*userDiscount)*salesTax));//Tell them the total
		
		userInput.close();// Closing the input
	}
}
