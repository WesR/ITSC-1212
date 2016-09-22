package com.wesring.lab4;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class act4 {
	public static void main(String[] args) {
		final String userQuote = "The programmers of tomorrow are the wizards of the future. You’re going to look like you have magic powers compared to everybody else.";
		Scanner userInput = new Scanner(System.in); // Define the scanner
		String userString, userChar;
		int userInt;
		String systemQuote = " - Abraham Lincoln";
		
		System.out.println("Quote: " + userQuote);//Display quote
		System.out.println("Length" + userQuote.length());//Display is length
		
		System.out.print("Please input a string to find it in the quote \n>"); //Prompt the user
		userString = userInput.nextLine();
		if (userQuote.contains(userString)){
			System.out.println("The quote has " + userString + " at " + userQuote.indexOf(userString)); //Quote found
		} else { 
			System.out.println("Sorry, " + userString + " could not be found");//No quote
		}
		
		System.out.print("Please input a character to find its first occerence in the quote\n>"); //Prompt the user
		userChar = userInput.nextLine();
		if (userQuote.contains(userChar)){
			System.out.println("The quote has " + userChar + " at " + userQuote.indexOf(userChar)); //Quote found
		} else { 
			System.out.println("Sorry, " + userChar + " could not be found");//No quote
		}
		
		System.out.print("Please input a number to see what letter is there in the quote\n>"); //Prompt the user
		userInt = userInput.nextInt();
		if (userQuote.length() >= userInt){
			System.out.println("At " + userInt + " , there is the letter " + userQuote.substring(userInt, userInt + 1)); //Quote found
		} else { 
			System.out.println("Sorry, " + userChar + " could not be found");//No quote
		}
		
		System.out.println("The quote all uppercase is: \n" + userQuote.toUpperCase());//Display quote
		
		System.out.println("The quote is: " + userQuote.concat(systemQuote));//Display quote with the fake cite
	}
}
