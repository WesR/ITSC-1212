package com.wesring.lab8;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/9/2016
 * 
 */

public class act1 {
	public static void main(String[] args){
		int[][] array = new int[4][5];//Our array
		Random r = new Random();//Random number generator
		
		for(int i = 0; i < 4; i++){
			for(int p = 0; p < 5; p++){
				array[i][p] = (r.nextInt(10) + 1);//Inputs a random number between 1-10
			}
		}
		
		System.out.println(Arrays.deepToString(array));//Print the array
	}
}
