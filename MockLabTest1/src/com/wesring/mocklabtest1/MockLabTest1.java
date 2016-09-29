package com.wesring.mocklabtest1;

import java.util.Random;
import java.util.Scanner;

/**
*SnackMachine
*
*@author Wesley Ring
*@version 09/29/2016
*Lab Section 08
*
*Purpose: This program is here to calculate the total cost of snacks at a store
*Pseudocode: 
*			Output:    Chips Chocolate Bar Cookies Peanut Butter Crackers  and Assorted Nuts 
*			Input: accept a letter input of the selection
*			Output: selection
*			Input: Quantity of item
*			Output: Total cost of item(s)
*			Input: souvenir name
*			Caculate: souvenir price, between 5$ - 15$
*			Output: Cost and name of souvenir
*			Output: New total with sales tax
*/

public class MockLabTest1 {
	public static void main(String[] args) {
		char userSelection;//The item selection var
		String userCustName;//The souvenir items name
		double itemBasePrice, userTotal, userCustPrice;//The item price, the total, and the souvenir price
		
		Random r = new Random();
		Scanner userInput = new Scanner(System.in); //Define the scanner

		System.out.println("Welcome to the Convenience Store");//Welcome message
		
		System.out.println("\nWhat would you like to buy:"); //Displaying the things to buy
		System.out.println("A.	Chips - $1.25");
		System.out.println("B.	Chocolate Bar - $1.00");
		System.out.println("C.	Cookies - $1.75");
		System.out.println("D.	Peanut Butter Crackers - $1.50");
		System.out.println("E.	Assorted Nuts - $2.25");
		System.out.print(">");//So it looks nicer when they input their choice
		
		userSelection = userInput.next().toLowerCase().charAt(0);//Inputs the next character, and makes it lowercase
		
		switch(userSelection){//Get the price of the item bought, and output the selection
		case 'a':
			System.out.println("You chose to buy chips for $1.25 each");
			itemBasePrice = 1.25;
			break;
		case 'b':
			System.out.println("You chose to buy Chocolate Bar(s) for $1.00 each");
			itemBasePrice = 1.00;
			break;
		case 'c':
			System.out.println("You chose to buy Cookies for $1.75 each");
			itemBasePrice = 1.75;
			break;
		case 'd':
			System.out.println("You chose to buy Peanut Butter Crackers for $1.50 each");
			itemBasePrice = 1.50;
			break;
		case 'e':
			System.out.println("You chose to buy Peanut Assorted Nuts for $2.25 each");
			itemBasePrice = 2.25;
			break;
		default:
			System.out.println("Error, incorrect selection. You chose to buy nothing");
			itemBasePrice = 0.0;
		}
		
		System.out.print("\nHow many would you like to buy?\n>");
		userTotal = itemBasePrice * userInput.nextInt();//Mathing the total, with the number bought
		
		System.out.println("\nYour subtotal is: $" + userTotal);//Displaying the subtotal
		
		System.out.print("\nYou have decided to buy a souvenir, what did you buy?\n>"); //Getting the souvenir name
		userCustName = userInput.next();
		
		userCustPrice = r.nextInt(11) + 5;//Generate a number between 5 and 15
		System.out.println("You bought a " + userCustName + " for $" + userCustPrice);//Output the souvenir info
		
		userTotal += userCustPrice;//Get the total cost
		System.out.println("\nYour total, with %7 tax, is $" + (userTotal * 1.07));//Output the total price, with tax
		
		userInput.close();//Close the scanner
	}
}
