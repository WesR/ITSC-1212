package com.wesring.chapter4;

import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/6/2016
 * Description: Checks to see if there is a substring in the main string
 */

public class HasSubstring {
	public static void main(String[] args){
		String userString, userSubString;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Enter string s1:");//Input the main string
		userString = userInput.nextLine();
		System.out.print("Enter string s2:");//Input the search string
		userSubString = userInput.nextLine();
		
		System.out.print(userSubString);//Print substring
		if (userString.indexOf(userSubString) != -1){//Print that is is or is not a substring
			System.out.print(" is a substring of ");
		} else {
			System.out.print(" is not a substring of ");
		}
		System.out.print(userString);//Print the final string
		
		userInput.close();//Close the input
	}
}
