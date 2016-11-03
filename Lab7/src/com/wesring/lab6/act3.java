package com.wesring.lab6;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act3 {
	public static void main(String[] args){
		int[] userArray = new int[50];//To store the ints
		
		userArray = fillRandom(userArray);//Get the nums
		
		System.out.println("Highest value " + getHighest(userArray));
		System.out.println("Get lowest " + getLowest(userArray));
		System.out.println("Average " + getAverage(userArray));
		System.out.println("Above average " + getAboveAverage(userArray));
		System.out.println("Below average " + getBelowAverage(userArray));
		
	}
	
	private static String getBelowAverage(int[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getAboveAverage(int[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getAverage(int[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getLowest(int[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getHighest(int[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[] fillRandom(int[] arr1){//Fills and array with random values
		Random r = new Random();
		
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = r.nextInt(1000) + 1;//Fills a random number between 1 and 1000
		}
		return arr1;
	}
}
