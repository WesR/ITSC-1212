package com.wesring.lab6;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act2 {
	public static void main(String[] args){
		int[] userNum;//To store the ints
		int numIndex;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("Please enter the length you would like the array to be");
		System.out.print(">");
		userNum = new int[userInput.nextInt()];
		
		userNum = fillRandom(userNum);//Random! like magic
		
		System.out.println("Please input a value to took for (Searching index 0-" + (userNum.length - 1) + ")");
			System.out.print(">");
			numIndex = findIndex(userNum, userInput.nextInt());
			if (numIndex != -1){
				System.out.println("Index: " + numIndex);
			} else {
				System.out.println("Number not found");
			}
			
	}
	public static int findIndex(int[] arr1, int value){
		 for(int i = 0; i < arr1.length; i++){//Check all vars
			 if(arr1[i] == value){//Check if they match
				 return i;
			 }
		 }
		 return -1;//if no match is found
	}
	
	
	public static int[] fillRandom(int[] arr1){//Fills and array with random values
		Random r = new Random();
		
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = r.nextInt(50);//Fills a random number between 0 and 49
		}
		return arr1;
	}
}
