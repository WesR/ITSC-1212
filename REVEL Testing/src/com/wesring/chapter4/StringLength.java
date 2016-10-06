package com.wesring.chapter4;

import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/6/2016
 * Description: Caculates a strings length and first char
 */
public class StringLength {
	public static void main(String[] args){
		String userString;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Enter a string:");//Input the string
		userString = userInput.nextLine();
		
		System.out.println("The string is of length " + userString.length() + " and the first character is " + userString.substring(0, 1));
	}
}
