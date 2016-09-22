package com.wesring.lab4;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class act1 {
	public static void main(String[] args) {
		String[] userWords = new String[5];
		Scanner userInput = new Scanner(System.in); // Define the scanner
		
		System.out.print("Please input a verb, an adjective, an adverb, and a noun \n>"); //Prompt the user
		userWords[0] = userInput.next();//Get the verb
		userWords[1] = userInput.next();//Get the Adj
		userWords[2] = userInput.next();//Get the adverb
		userWords[3] = userInput.next();//Get the noun
		
		userWords[4] = userWords[2].concat(" " + userWords[3] +  " is " + userWords[0] +  " " + userWords[1]);//concatenating the words
		
		System.out.print(userWords[4]);//Print the answer
		
		userInput.close();//stop that scanner
	}
}
