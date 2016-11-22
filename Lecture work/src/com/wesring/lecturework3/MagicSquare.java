package com.wesring.lecturework3;

import java.util.Random;
import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		Boolean mainMenuRun = true;
		int[][] userSquare = new int[3][3];
			
		//Prompt
		System.out.println("Hello User.");
		System.out.println("A Magic Square is a square that is divided into smaller squares, each containing a number, such that the figures in each vertical,\n horizontal, and diagonal row add up to the same value.");
		System.out.println("We are tasked to try to generate one, if we do correctly, I will tell you!");
		System.out.println("Good Luck");
		
		System.out.print("\nEnter \"start\" to begin\n>");//Prompt
		if(userInput.nextLine().toLowerCase().equals("start")){//I would have preferred to do a menu to select game modes, but this was required
			System.out.println("Menu (1/2/3)");//I added this for debugging, but i think it is a useful function
			System.out.println("1. Enter a Magic Square");
			System.out.println("2. Generate a Magic Square");
			System.out.println("3. Exit");
			switch(userInput.nextInt()){
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("GoodBye");
				break;
			default:
				System.out.println("Error, Invalid Input.\nAborting");
				break;
			}
		}else{
			System.out.println("Goodbye");
		}
	}
	
	public static int sumRows(int[][] userArray){//Returns the sum of the rows if the same, -1 if not
		int rowSum[] = new int[3];
		
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
		int colSum[] = new int[3];
		
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
		int diagSum[] = new int[2];
		
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
			System.out.println();//Return line
		}
	}
	
	public static int[][]  fillMatrix(){//Randomly fills the array
		Random r = new Random();
		int[][] userArray = {{9,1,2},{3,4,5},{6,7,8}};
		int[] index1 = {0,0}, index2 = {0,0};//The index numbers
		int temp;//temp int Storage
		
		for(int i = 0; i < 50; i++){//Shuffle 50 times
			index1[0] = r.nextInt(3);//Generate location 1 
			index1[1] = r.nextInt(3);//Generate location 1 
			index2[0] = r.nextInt(3);//Generate location 2
			index2[1] = r.nextInt(3);//Generate location 2
			
			//Rotating the ints
			temp = userArray[index1[0]][index1[1]];
			userArray[index1[0]][index1[1]] = userArray[index2[0]][index2[1]];
			userArray[index2[0]][index2[1]] = temp;
		}
		
		//Doing it the shuffle way makes sure we get a matrix without repeating numbers. This saves us time when finding squares
		
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
