package com.wesring.lab4;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class Distance {
	public static void main(String[] args) {
		double X1,Y1,X2,Y2;
		Scanner userInput = new Scanner(System.in); // Define the scanner
		
		System.out.println("Point distance calculator");
		System.out.println("-Point 1");
		System.out.print("Please input the X value, followed by the Y \n>"); //Prompt the user
		  X1 = userInput.nextDouble();
		  Y1 = userInput.nextDouble();
		System.out.println("-Point 2");
		System.out.print("Please input the X value, followed by the Y \n>"); //Prompt the user
		  X2 = userInput.nextDouble();
		  Y2 = userInput.nextDouble();
		  
		  System.out.println("The distance between both points is: " + (Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2))));
	}
}
