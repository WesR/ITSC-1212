package com.wesring.lab2;

import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/8/2016
 */
public class act3 {
	public static void main(String[] args){
		double inputOne, inputTwo;	//Define the vars
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("Hello! I am here to show you devision and mod of two inputs."); //Say hello
		
		System.out.print("Please input varible one \n>"); //Get var one
		inputOne = userInput.nextDouble();
		
		do{
		System.out.print("Please input varible two (No zeros)\n>"); //Get var two
		inputTwo = userInput.nextDouble();
		}while(inputTwo == 0);
		
		System.out.println("To get the answer with division, we devide " +inputOne+" by "+ inputTwo + " and get " + (inputOne/inputTwo) + "."); //Output divided
		System.out.println("To get the modulus, we mod " +inputOne+" by "+ inputTwo + " and get " + (inputOne%inputTwo)+ ".");//Output mod
		
		System.out.println("Good bye!");
		userInput.close();
	}
}
