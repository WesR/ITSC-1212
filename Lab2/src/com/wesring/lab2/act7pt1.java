package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/8/2016
 */
public class act7pt1 {
	public static void main(String[] args){
		double mealCost;	//Define mealCost
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Please input the cost of the meal \n>"); //Get the meal cost
		mealCost = userInput.nextDouble();
		
		System.out.println("(¯`·.¸¸.·´¯`·.¸¸.-> Tip: " + (mealCost * 1.15) + " <-.¸¸.·´¯`·.¸¸.·´¯)");//Display the Tip (15%)
		
		userInput.close();//Close the scanner
	}
}
