package com.wesring.lab3;

import java.util.Scanner;

public class act4 {
	public static void main(String[] args) {
		int userYear;
		Scanner userInput = new Scanner(System.in); // Define the scanner

		System.out.print("Please input the year \n>"); //Prompt the user
		userYear = userInput.nextInt();
		
		if(userYear % 4 == 0){//Is devisible by 4
			if(userYear % 100 != 0){//Is not devisible by 100
				System.out.println("Congrats, " + userYear + " is a leap year.");//Is leap year
			} else {
				if(userYear % 400 == 0){//Is devisible by 400
					System.out.println("Congrats, " + userYear + " is a leap year.");//Is leap year
				} else {
					System.out.println("Sorry, " + userYear + " is not a leap year.");//Not leap year
				}
			}
		} else {
			System.out.println("Sorry, " + userYear + " is not a leap year.");//Not leap year
		}
	}
}
