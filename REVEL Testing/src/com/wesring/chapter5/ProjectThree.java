package com.wesring.chapter5;

import java.text.DecimalFormat;
import java.util.*;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/14/2016
 * 
 */

class grades implements Comparable<grades> {
	//I made a custom list, that holds both ints and strings
	//I did this because lists autosort, making it easier to get the top two students
    double grades;
    String name;

    public grades(double grades, String name) {
        this.grades = grades;
        this.name = name;
    }

    @Override//The sorting
    public int compareTo(grades o) {
        return grades < o.grades ? -1 : grades > o.grades ? 1 : 0;
    }
}

public class ProjectThree {
	public static void main(String[] args){
		List<grades> userGrades = new ArrayList<grades>();//Making a new grades list
		DecimalFormat df = new DecimalFormat("0.00");//Because we need the trailing zeros for it to submit online :(
		int numStudents;//How many students are there? 
		double studentGrade;//temp  for student grades
		String studentName;//Temp for names
		Scanner userInput = new Scanner(System.in); //Define the scanner
	
		System.out.println("Enter the number of students:");//Prompt
		numStudents = userInput.nextInt();//Get user Input start
	
		for(int i = 1; i <= numStudents; i++){
			System.out.println("Student " + i + " of " + numStudents);
			userInput.nextLine();//Clearing the enter from the last command
			System.out.println("Enter the students name:");//Prompt
			studentName = userInput.nextLine();//Getting the name
			System.out.println("Enter the students score:");//Prompt
			studentGrade = userInput.nextDouble();//Getting the grade
			userGrades.add(new grades(studentGrade, studentName));//Adding the name and grade
		}
		Collections.sort(userGrades);
		System.out.println("The highest score was " + df.format(userGrades.get(userGrades.size()-1).grades) + " and " + userGrades.get(userGrades.size()-1).name + " got it.");//Getting score
		System.out.println("The second highest score was " + df.format(userGrades.get(userGrades.size()-2).grades) + " and " + userGrades.get(userGrades.size()-2).name + " got it.");//getting second highest score
	}
}
