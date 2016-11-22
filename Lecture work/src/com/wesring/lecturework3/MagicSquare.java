package com.wesring.lecturework3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/22/2016
 * 
 * @Description
 * This program is for generating and checking if a magic square exists
 * A flow chart can be found in the same working directory
 */

public class MagicSquare {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		int[][] userSquare = new int[3][3];//Defining the Magic Square's array
			
		//Info
		System.out.println("Hello User.");
		System.out.println("A Magic Square is a square that is divided into smaller squares, each containing a number, such that the figures in each vertical,\n horizontal, and diagonal row add up to the same value.");
		System.out.println("We are tasked to try to generate one, if we do correctly, I will tell you!");
		System.out.println("Good Luck");
		
		System.out.print("\nEnter \"start\" to begin\n>");//Prompt
		if(userInput.nextLine().toLowerCase().equals("start")){//I would have preferred to do just a menu to select game modes, but this was required
			
			System.out.println("Menu (1/2/3)");//I added this menu for debugging, but i think it is a useful function
			System.out.println("1. Enter a Magic Square");
			System.out.println("2. Generate a Magic Square");
			System.out.println("3. Exit");
			switch(userInput.nextInt()){//The menu switch
			case 1:
				userSquare = enterSquare(userSquare);//Get the user Square
				if (isMagicSquare(userSquare)){
					System.out.println("Congrats! You made a Magic Square");//Square works
					System.out.println("You entered: ");
					displayMagicSquare(userSquare);//Display user square
				} else {
					System.out.println("I'm sorry, you did not make a Magic Square");//Square dosn't work
					System.out.println("You entered: ");
					displayMagicSquare(userSquare);//Display user square
				}
				break;
			case 2:
				do{
				userSquare = fillMatrix();
				}while(!isMagicSquare(userSquare));//Keep generating matrix's until they work
				
				System.out.println("Congrats! You discovered a new Magic Square");
				System.out.println("We generated: ");
				displayMagicSquare(userSquare);//Display the new square
				break;
			case 3:
				System.out.println("GoodBye then");//User exit
				break;
			default:
				System.out.println("Error, Invalid Input.\nAborting");//Invalid input
				break;
			}
		}else{
			System.out.println("Goodbye");//end
		}
		userInput.close();//Dont want a leak
	}
	
	
	public static int[][] enterSquare(int[][] userArray){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		
		for(int i = 0; i < userArray.length; i++){//Get all the values
			for(int p = 0; p < userArray[0].length; p++){
				System.out.println("Please enter row " + i + " column " + p);
				userArray[i][p] = userInput.nextInt();
			}
		}
		
		userInput.close();//Kill the leak
		return userArray;//Return the filled out matrix
	}
	
	public static int sumRows(int[][] userArray){//Returns the sum of the rows if the same, -1 if not
		int rowSum[] = new int[3];//Define a total holder for each row
		
		rowSum[0] = userArray[0][0] + userArray[0][1] + userArray[0][2];//Total Row one
		rowSum[1] = userArray[1][0] + userArray[1][1] + userArray[1][2];//Total Row Two
		rowSum[2] = userArray[2][0] + userArray[2][1] + userArray[2][2];//Total Row Three
		
		if (rowSum[0] == rowSum[1] && rowSum[1] == rowSum[2]){
			return rowSum[0];//Return the value of the rows
		} else {
			return -1;//No match
		}
	}
	
	public static int sumColumns(int[][] userArray){//Returns the sum of the columns if the same, -1 if not
		int colSum[] = new int[3];//Define a total holder for each column
		
		colSum[0] = userArray[0][0] + userArray[1][0] + userArray[2][0];//Total col one
		colSum[1] = userArray[0][1] + userArray[1][1] + userArray[2][1];//Total col Two
		colSum[2] = userArray[0][2] + userArray[1][2] + userArray[2][2];//Total col Three
		
		if (colSum[0] == colSum[1] && colSum[1] == colSum[2]){
			return colSum[0];//Return the value of the cols
		} else {
			return -1;//No match
		}
	}
	
	public static int sumDiagonals(int[][] userArray){//Returns the sum of the Diagonals if the same, -1 if not
		int diagSum[] = new int[2];//Define a total holder for each diagonal
		
		diagSum[0] = userArray[0][0] + userArray[1][1] + userArray[2][2];//Total diag one \
		diagSum[1] = userArray[2][0] + userArray[1][1] + userArray[0][2];//Total diag Two /
		
		if (diagSum[0] == diagSum[1]){
			return diagSum[0];//Return the value of the diags
		} else {
			return -1;//No match
		}
	}
	
	public static boolean isUnique(int [][] userArray, int value){//Checks if num exists in the array, if it returns false (Why false? Why not true?)
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				if (userArray[i][p] == value){
					return false;//match
				}
			}
		}
		return true;//No match
	}
	
	public static void displayMagicSquare(int [][] userArray){//Prints the square
		for(int i = 0; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				System.out.print(String.format("%1$4s",userArray[i][p]));//Print, with added white space
			}
			System.out.println();//Return line for formatting
		}
	}
	
	public static int[][]  fillMatrix(){//Randomly fills the array
		Random r = new Random();//Our random generator
		int[][] userArray = {{9,1,2},{3,4,5},{6,7,8}};//The base user array
		int[] index1 = {0,0}, index2 = {0,0};//The index numbers
		int temp;//temp int Storage
		
		for(int i = 0; i < 50; i++){//Shuffle 50 times
			index1[0] = r.nextInt(3);//Generate location 1 x
			index1[1] = r.nextInt(3);//Generate location 1 y
			index2[0] = r.nextInt(3);//Generate location 2 x
			index2[1] = r.nextInt(3);//Generate location 2 y
			
			//Rotating the ints
			temp = userArray[index1[0]][index1[1]];
			userArray[index1[0]][index1[1]] = userArray[index2[0]][index2[1]];
			userArray[index2[0]][index2[1]] = temp;
		}
		
		/*
		 * 	Doing it the shuffle way makes sure we get a matrix without repeating numbers.
		 *  This saves us time when finding squares 
		 */
		
		return userArray;//Returned the random matrix
	}
	
	public static Boolean isMagicSquare(int [][]userArray){//Returns true if it is a magic square
		if (sumRows(userArray) != -1 && sumRows(userArray) == sumColumns(userArray) && sumColumns(userArray) == sumDiagonals(userArray)){//Does it work?
			for (int i = 1; i < 9; i++){
				if(isUnique(userArray, i)){
					return false;//Fails all int test
				}
			}
			return true;//It passed both tests
		}
		return false;//Fails row/diag/col test
	}
}
