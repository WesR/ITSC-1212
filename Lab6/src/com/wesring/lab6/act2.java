package com.wesring.lab6;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/20/2016
 * 
 */

public class act2 {
	final static double salesTax = 1.046; // Define the sales tax
	
	public static double calculateDiscount(int userDate){
		switch (userDate) {// Grab the user input
		case 2014:
			System.out.println("You get a 15% discount");
			return 0.85;
		case 2015:
			System.out.println("You get a 10% discount");
			return 0.90;
		case 2016:
			System.out.println("You get a 5% discount");
			return 0.95;
		default:
			System.out.println("You get no discount");// just in case
			return 1.0;
		}

	}
	
	public static double calculateFinalPrice(double userBill, double userDiscount){
		return ((userBill*userDiscount)*salesTax);
	}
	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); // Define the scanner
		NumberFormat  nf = NumberFormat.getCurrencyInstance();

		double userBill;// Define the users bill
		double userDiscount;// Define the users discount

		System.out.print("Please input your bill total \n>"); // Prompt the user
		userBill = userInput.nextDouble();

		System.out.print("Please input your membership code \n>"); // Prompt the user
		userDiscount = calculateDiscount(userInput.nextInt());
		System.out.println("Your total bill is " + nf.format(calculateFinalPrice(userBill,userDiscount)));//Tell them the total
		
		userInput.close();// Closing the input
	}
}
