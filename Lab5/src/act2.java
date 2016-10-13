import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 * Logic: 
 * loop 
 * 	  Get input
 * 	  Check to see if its -1
 * 		Add their grades together
 * 		Add to student count
 * end loop when input is -1
 * Output gradetotal/studentcount
 */

public class act2 {
	public static void main(String[] args){
		int numStudents = 0, gradeTotal = 0, temp = 0;
		Scanner userInput = new Scanner(System.in); //Define the scanner
			
		System.out.println("Grade counter");
		do{
			System.out.print("What is the grade of the next student?(or -1 to quit)\n>");
			temp = userInput.nextInt();
			if(temp != -1){
				gradeTotal += temp;
				numStudents++;
			}
		}while(temp != -1);
			
		System.out.println("The grade average is a "+ (gradeTotal / numStudents) + " for the " + numStudents + " students.");
		userInput.close();//Mopping up the leaks
	}
}
