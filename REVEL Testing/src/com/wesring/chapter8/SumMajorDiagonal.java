package com.wesring.chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/23/2016
 * 
 */

public class SumMajorDiagonal {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		double[][] userMatrix;//To store the users values
		int matrixSize;//The x and y of the matrix
		
		System.out.println("Enter dimension n of nxn matrix:");//Prompt
		matrixSize = userInput.nextInt();//Get the x and y
		userMatrix = new double[matrixSize][matrixSize];//allot the x and y
		
		for(int i = 0; i < matrixSize; i++){//Get each row
			System.out.println("Enter row " + i + ":");//Prompt
			for(int p = 0; p < matrixSize; p++){//get the columns
				userMatrix[i][p] = userInput.nextDouble();//Get the r and c
			}
		}
		
		//System.out.println(Arrays.deepToString(userMatrix));//Testing what we get
		
		System.out.println(sumMajorDiagonal(userMatrix));//Output the Diagonal total
	}
	
	public static double sumMajorDiagonal(double[][] m){
		double diagTotal = 0;//The total of the Diagonal
		
		for(int i = 0; i < m.length; i++){//Get all the values
			for(int p = 0; p < m[0].length; p++){
				if(p==i){
					diagTotal+= m[i][p];
				}
			}
		}
		return diagTotal;
	}
}
