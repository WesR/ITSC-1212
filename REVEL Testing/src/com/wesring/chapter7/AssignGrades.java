package com.wesring.chapter7;

import java.util.Scanner;

public class AssignGrades {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		int bestScore = 0;
		String grade;
	
		System.out.println("Enter the number of students:");
		int numStudents = userInput.nextInt();
		int[] score = new int[numStudents];
	
		System.out.println("Enter " + numStudents + " scores:");
		for (int i = 0; i < score.length; i++) {
		 score[i] = userInput.nextInt();
		 if (bestScore < score[i]) {
		  bestScore = score[i];
		 }
		}
	
		for (int i = 0; i < score.length; i++) {
		 if (score[i] >= bestScore - 10){
		  grade = "A";
		 } else if (score[i] >= bestScore - 20){
		  grade = "B";
		 } else if (score[i] >= bestScore - 30){
		  grade = "C";
		 } else if (score[i] >= bestScore - 40){
		  grade = "D";
		 } else {
		  grade = "F";
		 }
		  System.out.println("Student " + i +" score is " + score[i] +" and grade is " + grade);
		}
	}
}
