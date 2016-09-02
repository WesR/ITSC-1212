package com.wesring.Ch1Progr2;

//22.9 14
public class AvgSpeed {
	public static void main(String[] args){
		
		double distanceRan = 24.0 * 1.6; //Calculating the distance in km
		double timeRan = ((1*60)+(40)+(35.0/60.0))/60.0; //Changing the time to hours
		double answer = (distanceRan/timeRan); //Mathing it out
		
		//This next fancy bit with the string is here because Pearson and their REVEL software wouldn't accept an answer with more then 14 decimal places...
		//By default the program outputs 15 decimal places.
		String answerSTR = String.valueOf(answer);
		System.out.println(answerSTR.substring(0,17));
	}	
}
