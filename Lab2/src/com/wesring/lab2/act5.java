package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/8/2016
 */
public class act5 {
	public static void main(String[] args){
		double inputOne, inputTwo;	//Define the vars
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.print("Please input the number of questions missed \n>"); //Get questions missed
		inputOne = userInput.nextDouble();
		
		System.out.print("Please input the total questions \n>"); //Get total questions
		inputTwo = userInput.nextDouble();
		
		System.out.println("The student got a " + ((inputOne/inputTwo) * 100)+ "%");//Display the grade
		
		userInput.close();//Close the scanner
	}
}
