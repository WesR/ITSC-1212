import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 * Logic: 
 * Get student count
 * loop number of students
 * 		Add their grades together
 * Output gradetotal/studentcount
 */

public class act1 {
	public static void main(String[] args){
		int numStudents, gradeTotal = 0;
		Scanner userInput = new Scanner(System.in); //Define the scanner
	
		System.out.print("Welcome, how many students are in your class?\n>");
		numStudents = userInput.nextInt();//Getting the student count
		
		for(int i = 1; i <=numStudents;i++){//Adding all their grades to the total
			System.out.print("What is the grade of student " + i + "?\n>");
			gradeTotal += userInput.nextInt();
		}
		System.out.println("The grade average is a "+ (gradeTotal / numStudents));
		userInput.close();//Mopping up the leaks
	}
}
