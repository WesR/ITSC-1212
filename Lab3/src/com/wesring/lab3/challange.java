package com.wesring.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 */
public class challange {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); // Define the scanner
		Random r = new Random();

		int inputOne, inputTwo;// Define da digets
		int[] randNum = {0,0,0};

		// Inputs
		System.out.print("Please input number 1\n>"); // Prompt the user
		inputOne = userInput.nextInt();// Grab one
		System.out.print("Please input number 2\n>"); // Prompt the user
		inputTwo = userInput.nextInt();// Grab Two

		if(inputOne < inputTwo){
			int temp = inputOne;
			inputOne = inputTwo;
			inputTwo = temp;
		} 
		
		//Gimmi some random
		randNum[0] = r.nextInt((Math.abs(inputOne - inputTwo))) + inputTwo;
		randNum[1] = r.nextInt((Math.abs(inputOne - inputTwo))) + inputTwo;
		randNum[2] = r.nextInt((Math.abs(inputOne - inputTwo))) + inputTwo;
		
		Arrays.sort(randNum);//Lets sort it
		
		for (int i = 0; i < 3; i++) {//Lets display it
			   System.out.println("Your number is " + randNum[i] );
		}
		
		userInput.close();//Close the scanner
	}
}
