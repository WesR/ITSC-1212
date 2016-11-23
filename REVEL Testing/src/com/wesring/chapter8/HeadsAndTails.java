package com.wesring.chapter8;

import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/23/2016
 * 
 */

public class HeadsAndTails {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		int userDecimalInt;//The decimal representation
		String userBinaryInt;//The binary representation
		
		System.out.print("Enter an integer representing the state of the coins:");//Prompt
		userDecimalInt = userInput.nextInt();//Get the int
		userBinaryInt = String.format("%9s", Integer.toBinaryString(userDecimalInt)).replace(' ', '0');//Convert it to binary
		
		//System.out.println(userBinaryInt);//Debuging
		
		for(int i = 0; i < userBinaryInt.length(); i++){
			if(userBinaryInt.substring(i, i + 1).contains("0")){//get the nmber at the index
				System.out.print("H");//output 0
			} else {
				System.out.print("T");//output 1
			}
			if (i == 2 || i == 5){
				System.out.println();//Return the matrix
			}
		}
	}
}
