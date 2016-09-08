package com.wesring.lab2;

import java.util.Scanner;

public class act6 {
	public static void main(String[] args){
		double inputOne, inputTwo;	//Define the vars
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Please input the number of miles driven \n>"); //Get the miles driven
		inputOne = userInput.nextDouble();
		
		System.out.print("Please input gallons of gas used \n>"); //Get gallons used
		inputTwo = userInput.nextDouble();
		
		System.out.println("The mpg of the car is " + (inputOne/inputTwo) + " mpg.");//Display the mpg
		
		userInput.close();//Close the scanner
	}
}
