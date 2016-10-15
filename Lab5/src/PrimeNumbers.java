import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 */

public class PrimeNumbers {
	public static void main(String[] args){
		int startNum, endNum;//Starting int and ending
		Scanner userInput = new Scanner(System.in); //Define the scanner
	
		System.out.println("Please enter a starting number, and then an ending number. (eg 2 - 10 or 5 - 5)");//Prompt
		System.out.print(">");//Formatting user input
		startNum = userInput.nextInt();//Get user Input start
		endNum = userInput.nextInt();//Get user Input end
		if (startNum <= endNum){//Checking to see if start is less then in
			do{
				if (isPrime(startNum)){//Print it is or is not 
					System.out.println(startNum + " is prime");
				} else {
					System.out.println(startNum + " is not prime");
				}
				startNum++;//Add to the counter
			}while(startNum <= endNum);//Loop until its done
		} else {
			System.out.println("Please enter a lower number followed by a larger number");//Larger number was first
		}
	}
	
	public static Boolean isPrime(int testNum){//Prime checker
		 for (int i = 2; i < testNum; i++) {
		        if (testNum % i == 0) {
		            return false;//Is not prime
		        }
		    }
		    return true;//is prime
	}
}
