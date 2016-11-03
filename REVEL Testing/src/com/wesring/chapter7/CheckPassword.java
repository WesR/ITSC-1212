package com.wesring.chapter7;
import java.util.Scanner;
 
public class CheckPassword {
 
 public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  System.out.print("Enter a password:");
  String userPass = userInput.nextLine();
 
  if (checkPass(userPass)) {
   System.out.println("Valid Password");
  } else {
   System.out.println("Invalid Password");
  }
 }
 
 public static boolean checkPass(String password) {
Boolean flag = false;
  if (password.length() < 8) {
   return false;
  } 
  
  int numberCount = 0;
  for (int i = 0; i < password.length(); i++) {
	  if(!((password.charAt(i) <= 'z' && password.charAt(i) >= 'a') || (password.charAt(i) <= 'Z' && password.charAt(i) >= 'A'))){
		  if (!flag){
			  flag = true;
		  }
	  }
	  
	  if(!((password.charAt(i) <= 'z' && password.charAt(i) >= 'a') || (password.charAt(i) <= 'Z' && password.charAt(i) >= 'A') || (password.charAt(i) >= '0' && password.charAt(i) <= '9'))){
		  return false;
	  }
	  
  if ((password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
     numberCount++;
    }
  }
						 
  if (numberCount < 2 || !flag) { 
      
	    return false;
}
  return true;
}
}