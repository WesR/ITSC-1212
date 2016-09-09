package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/9/2016
 */
public class Post1 {
	public static void main(String[] args) {
		double carCost;	//Define mealCost
		String carModel;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Please input the car model \n>"); //Input Car price
		carModel = userInput.nextLine();
		
		System.out.print("Please input the cost of the car \n>"); //Input Car price
		carCost = userInput.nextDouble();
			
		System.out.println("-----------------------------------");//Formatting
		System.out.println("-    Car Sale \n-");//Formatting
		System.out.println("-    Model: - - - - - - " + carModel);//Output Car Model
		System.out.println("-    Base Price:  - - - $" + carCost);//Output Initial Cost
		System.out.println("-    Sales Tax: - - - - 3.6%");//Output Sales Tax
		System.out.println("-    Member Discount: - 15%");//Output Discount
		System.out.println("-    Total Price: - - - $" + ((carCost * 1.036) * 0.85));//Output Final price
		System.out.println("-\n-    Commission:  - - $" + (carCost * 0.10));//Output Commission
		System.out.println("-\n-----------------------------------");//Formatting
		
		userInput.close();//Close the scanner
	}
}
