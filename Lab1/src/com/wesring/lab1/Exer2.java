package com.wesring.lab1;

import java.util.Scanner;

/*
 * Define: Input scanner
 * Prompt
 * Prompt,input and math
 */
public class Exer2 {
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);//Make the scanner
			
			System.out.println("What is your speed in kph?");//Formatting
			System.out.print(">");
			
			System.out.println("Your going " + (input.nextInt() * 0.621) + " mph"); //Math and display
			
			input.close();//Close the scanner
	}
}
