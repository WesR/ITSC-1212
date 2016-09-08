package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/8/2016
 */
public class act2 {
	public static void main(String[] args) {
		double recWidth, recLength;	//Define the vars
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("Hello! I am here to help you caculate the area and paremeter of a rectangle."); //Say hello
		
		System.out.print("Please input the Width \n>"); //Get the width
		recWidth = userInput.nextDouble();
		
		System.out.print("Please input the Length \n>"); //Get the Length
		recLength = userInput.nextDouble();

		System.out.println("To get the area, we multiply " +recWidth+" with "+ recLength + " and get " + (recWidth*recLength) + "."); //Output what;s happening when multuplying
		System.out.println("To get the paremeter, we add two " +recWidth+" and two "+ recLength + " and get " + (2 * recWidth + 2 * recLength)+ ".");
		
		System.out.println("Good bye!");
		userInput.close();
	}
}
