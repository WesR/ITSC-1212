package com.wesring.lab6;

import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act1 {
	public static void main(String[] args){
		int[] userNum = new int[10];//To store the ints
		int userSelect;//To store the user selection int
		Scanner userInput = new Scanner(System.in); //Define the scanner
		

		System.out.println("Please enter 10 numbers");//Getting the user input
		for(int i = 0; i <10; i++){//Looping for all 10
			System.out.print((i+1)+">");
			userNum[i] = userInput.nextInt();
		}
		System.out.println("Thanks!");//Thankyou message
		
		System.out.println("Now you can search for a specific number entered based off of the index.(1-9, and -1 to exit)");//Getting the user input
		do{
			System.out.print(">");
			userSelect = userInput.nextInt();
			if (userSelect >=0 && userSelect <= 9){
				System.out.println("The number at index " + userSelect + " is " + userNum[userSelect]);//index
			} else if (userSelect != -1){
				System.out.println("Invalid Input!");//Invalid input
			}
		}while(userSelect != -1);
		
		userInput.close();//Sprung a leak
	}
}
