package com.wesring.Ch1Progr2;

//22.9 14
public class AvgSpeed {
	public static void main(String[] args){
		double distanceRan = 24.0 * 1.6;
		double timeRan = ((1*60)+(40)+(35.0/60.0))/60.0;
		double answer = (distanceRan/timeRan);
		String answerSTR = String.valueOf(answer);
		
		System.out.println(answerSTR.substring(0,17));
	}	
}
