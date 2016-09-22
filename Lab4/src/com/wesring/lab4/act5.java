package com.wesring.lab4;

import java.text.*;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class act5 {
	public static void main(String[] args) {
		double num1 = 5, num2 = 7;//Vars
		NumberFormat format = new DecimalFormat("#.##");//Formatter
		
		if (num2 != 0){//no/0
			System.out.println(format.format((num1/num2)));//Output
		} else {
			System.out.println("You cannot divide by zero");//Error
		}
	}
}
