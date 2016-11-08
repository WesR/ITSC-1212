package com.wesring.lab7;

import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

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
		String belowAverage = ""; 
		int arrayAverage = getAverage(userArray);
		
		for(int i = 1; i < userArray.length; i++){
			if (userArray[i] > arrayAverage){
				belowAverage = belowAverage + " " + userArray[i];
			}
		}
		
		return belowAverage;
	}

	private static String getAboveAverage(int[] userArray) {
		String aboveAverage = ""; 
		int arrayAverage = getAverage(userArray);
		
		for(int i = 1; i < userArray.length; i++){
			if (userArray[i] > arrayAverage){
				aboveAverage = aboveAverage + " " + userArray[i];
			}
		}
		
		return aboveAverage;
	}

	private static int getAverage(int[] userArray) {
		int arrayTotal = 0;
		for(int i = 1; i < userArray.length; i++){
			arrayTotal += userArray[i];
		}
		return (arrayTotal / userArray.length);
	}

	private static int getLowest(int[] userArray) {
		int indexLowest = 0;
		for(int i = 1; i < userArray.length; i++){
			if (userArray[i] < userArray[indexLowest]){
				indexLowest = i;
			}
		}
		return userArray[indexLowest];
	}

	private static int getHighest(int[] userArray) {
		int indexHighest = 0;
		for(int i = 1; i < userArray.length; i++){
			if (userArray[i] > userArray[indexHighest]){
				indexHighest = i;
			}
		}
		return userArray[indexHighest];
	}

	public static int[] fillRandom(int[] arr1){//Fills and array with random values
		Random r = new Random();
		
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = r.nextInt(1000) + 1;//Fills a random number between 1 and 1000
		}
		return arr1;
	}
}
