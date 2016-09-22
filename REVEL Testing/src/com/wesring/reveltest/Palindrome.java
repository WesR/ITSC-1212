package com.wesring.reveltest;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); // Define the scanner
		
		System.out.print("Enter a three-digit integer:");
		int userNum = userInput.nextInt();//Grab the input
		
		if ((userNum / 100) ==(userNum %10) ){ //Check to see if both the first and the last int are the same
			System.out.print(userNum + " is a palindrome");
		} else {
			System.out.print(userNum + " is not a palindrome");
		}
	}
}