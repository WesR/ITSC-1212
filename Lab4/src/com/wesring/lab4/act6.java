package com.wesring.lab4;

import java.util.Random;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class act6 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int one = r.nextInt(7); //I was told to declare var's
		int two = r.nextInt(7);
		int three = r.nextInt(7);
		int four = r.nextInt(7);
		
		System.out.println("Dice simulator");
		System.out.println("Roll 1: " + one);
		System.out.println("Roll 2: " + two);
		System.out.println("Roll 3: " + three);
		System.out.println("Roll 2: " + four);
	}
}
