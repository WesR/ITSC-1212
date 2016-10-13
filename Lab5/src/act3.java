import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 * Logic: 
 * loop
 * 		Ask for input
 * Loop again if negative or divisible by 10
 * Output "Wise choice"
 * 
 */

public class act3 {
	public static void main(String[] args){
		int temp;//For the checker
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
	do{
		System.out.print("Please a positive number not devisible by 10.\n>");
		temp = userInput.nextInt();//Get input
	}while(temp %10 == 0 || temp <0);//Checking is positive and is not divisible by ten
	
	System.out.println("Wise choice");//Output message
	
	userInput.close();//Leaky
	}
}
