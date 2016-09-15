package com.wesring.lab3;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 */
public class act2 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); // Define the scanner

		System.out.print("Please input your membership code \n>"); //Prompt the user
		switch (userInput.nextInt()) {//Grab the user input
		case 2014:
			System.out.println("You get a 15% discount");
			break;
		case 2015:
			System.out.println("You get a 10% discount");
			break;
		case 2016:
			System.out.println("You get a 5% discount");
			break;
		default:
			System.out.println("You get no discount");//just in case
			break;
		}
		userInput.close();//Closing the input
	}
}
