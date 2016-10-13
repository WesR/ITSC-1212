import java.util.Random;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/13/2016
 * 
 * Logic: 
 * Welcome message
 * Loop while user hasn't entered 'goodbye'
 * 		Ask for question
 * 		Generate random  number
 * 		pick response from switch with number
 * 		Output response 
 * end
 * 
 */
public class act4 {
	public static void main(String[] args){
		String userQuestion;
		boolean chat = true;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("Hello, want to have a chat? Type a question! (Say goodbye to leave!)");
		
		do{
			System.out.print(">");//Formatting user input
			userQuestion = userInput.nextLine();//Get user Input
			if (userQuestion.toLowerCase().equals("goodbye")){//Check for the leave flag
				System.out.println("Goodbye! \nHave a nice day!");
				chat = false;
			} else {
				System.out.println("Bot> " + botResponse());//Write a response
			}
			
			
		}while(chat);
	}
	
	public static String botResponse(){
		Random r = new Random();//We need a random number
		
		switch(r.nextInt(4)){//Pick a random response
		case 0:
			return "I dont know, what do you think?";
		case 1: 
			return "How cool!";
		case 2: 
			return "But why?";
		case 3:
			return "Ask NASA!";
		case 4: 
			return "Who knows!";
		}
		return "ERROR";
	}
}
