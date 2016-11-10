package com.wesring.lab8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/10/2016
 * 
 */
public class act4 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		int[][] studentGrades = new int[4][4];//Fkey and three grades, for four students
		
		for(int i = 0; i < studentGrades.length; i++){
			for(int p = 0; p < studentGrades[0].length; p++){
				if(p == 0){//for the userID Fkey
					System.out.println("Please enter student " + (i+1) + "'s ID: ");
					studentGrades[i][p] = userInput.nextInt();//Get the userID
				} else {
					System.out.println("Please enter student " + (i+1) + "'s grade: ");
					studentGrades[i][p] = userInput.nextInt();//Get the grade
				}
			}
		}
		
		System.out.println("Student " + studentGrades[getHighest(studentGrades)][0] + " got the highest grade.");
		System.out.println(Arrays.deepToString(studentGrades));//Debuging
	}
	
	private static int getHighest(int[][] userArray) {
		int highIndex[] = {1,1};//I know there is somthing there
		for(int i = 1; i < userArray.length; i++){
			for(int p = 0; p < userArray[0].length; p++){
				if(userArray[i][p] > userArray[highIndex[0]][highIndex[1]]){//If its bigger, save the spot
					highIndex[0] = i;
					highIndex[1] = p;
				}
			}
		}
		return highIndex[0];//Return the highest int
	}
}
