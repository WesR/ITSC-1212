package com.wesring.lab3;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 */
public class act1 {
	public static void main(String[] args) {
		System.out.println("Welcome to the special give away.");//Hello
		
		if(Math.random() > 0.5) { //Select a random option
			System.out.println("You win 20% off");//20% off
		} else {
			System.out.println("You win 25% off");//25% off
		}
		
	}
}
