package com.wesring.lab8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/10/2016
 * 
 */

public class act3 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		int[][] userArray = new int[5][6];//New user Array
		int userBar;//Used in getAbove
		
		userArray = randomFillArray(userArray);//Random fill the array
		//System.out.println(Arrays.deepToString(userArray));//Testing
		
		System.out.println("What number woud you like to look over?");
		System.out.print(">");
		userBar = userInput.nextInt();//Get the bar
		
		System.out.println("Highest: " + getHighest(userArray));//Highest
		System.out.println("Lowest: " + getLowest(userArray));//Lowest
		System.out.println("Average: " + getAverage(userArray));//Average
		System.out.println("Elements over " + userBar + ": " + getAbove(userArray, userBar));//Above the usersBar
	}

	private static int getAbove(int[][] userArray, int userBar) {
		int itemAboveBar = 0;
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				if(userArray[i][p] > userBar){//If its bigger, save the spot
					itemAboveBar++;//Add one to the count
				}
			}
		}
		return itemAboveBar;//Return the number of elements over the user's bar
	}

	private static int getAverage(int[][] userArray) {
		int arrayTotal = 0;//Element total
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				arrayTotal += userArray[i][p];//Add everything
			}
		}
		return (arrayTotal / (userArray.length * userArray[0].length));//Return Average
	}

	private static int getLowest(int[][] userArray) {
		int lowIndex[] = {0,0};
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				if(userArray[i][p] < userArray[lowIndex[0]][lowIndex[1]]){//If its bigger, save the spot
					lowIndex[0] = i;
					lowIndex[1] = p;
				}
			}
		}
		return userArray[lowIndex[0]][lowIndex[1]];//Return the highest int
	}

	private static int getHighest(int[][] userArray) {
		int highIndex[] = {0,0};
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				if(userArray[i][p] > userArray[highIndex[0]][highIndex[1]]){//If its bigger, save the spot
					highIndex[0] = i;
					highIndex[1] = p;
				}
			}
		}
		return userArray[highIndex[0]][highIndex[1]];//Return the highest int
	}

	private static int[][] randomFillArray(int[][] userArray) {
		Random r = new Random();//Random number generator
		
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				userArray[i][p] = (r.nextInt(1000) + 1);//Inputs a random number between 1-10
			}
		}
		return userArray;
	}
}
