package com.wesring.lab2;

import java.util.Scanner;

public class act4 {
	public static void main(String[] args){
		double inputOne, inputTwo, tempVar;	//Define the vars
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Please input varible one \n>"); //Get var one
		inputOne = userInput.nextDouble();
		
		System.out.print("Please input varible two \n>"); //Get var one
		inputTwo = userInput.nextDouble();
		
		tempVar = inputOne; //Temp is now x
		inputOne = inputTwo; //One is now Y
		inputTwo = tempVar; //Two is now X
		
		userInput.close();
	}
}
