package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/8/2016
 */
public class act7pt2 {
	public static void main(String[] args) {
		int daysGone; // Define days vacationed
		Scanner userInput = new Scanner(System.in); // Define the scanner

		System.out.print("Please input the days vacationed \n>"); // Get the vacation time
		daysGone = userInput.nextInt();

		System.out.println("You spent " + (daysGone / 7) + " weeks and " + (daysGone % 7) + " days gone.");//Output the vacationed, with maths

		userInput.close();// Close the scanner
	}
}
