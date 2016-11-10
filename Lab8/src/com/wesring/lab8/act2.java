package com.wesring.lab8;

import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/10/2016
 * 
 */

public class act2 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		int[][] userTable;
		
		System.out.println("Please enter the number of rows followed by the number of columns");//Prompt
		System.out.print(">");
		userTable = new int[userInput.nextInt()][userInput.nextInt()];//Create the table to populate
		
		userTable = makeMultTable(userTable);
		
		printMultTable(userTable);//Print it all nice
		//System.out.println(Arrays.deepToString(userTable));//Print the array
		userInput.close();//Leaks
	}

	private static void printMultTable(int[][] userTable) {
		
		for(int i = 0; i < userTable.length; i++){
			for(int p = 0; p < userTable[0].length; p++){
				System.out.print(String.format("%1$4s",userTable[i][p]));//Print, with added white space
			}
			System.out.println();//Return line
		}
	}

	private static int[][] makeMultTable(int[][] userTable) {
		for(int i = 0; i < userTable.length; i++){
			for(int p = 0; p < userTable[0].length; p++){
				userTable[i][p] = (i+1)*(p+1);//Inputs a random number between 1-10
			}
		}
		
		return userTable;
	}
}
