package com.wesring.lecturework;

import java.util.Scanner;  
/** 
   This program demonstrates static methods 
*/ 
public class Geometry 
{ 
  public static void main(String[] args) 
  { 
    int choice;       // The user's choice
    double value = 0; // The method's return value
    char letter;      // The user's Y or N decision       
    double radius;    // The radius of the circle       
    double length;    // The length of the rectangle             
    double width;     // The width of the rectangle       
    double height;    // The height of the triangle       
    double base;      // The base of the triangle       
    double side1;     // The first side of the triangle       
    double side2;     // The second side of the triangle       
    double side3;     // The third side of the triangle 
 
    // Create a scanner object to read from the keyboard 
    Scanner keyboard = new Scanner(System.in); 
 
    // The do loop allows the menu to be displayed first       
    do 
     { 
       printMenu();//Print ze menue
       choice = keyboard.nextInt(); 
 
       switch (choice) 
       {             
         case 1: 
           System.out.print("Enter the radius of the circle:");               
           radius = keyboard.nextDouble(); 
           value = circleArea(radius);
           
           
           //store the result in the value variable  
           System.out.println("The area of the circle is " + value);                                   
           break; 
                       
         case 2: 
           System.out.print("Enter the length of the rectangle: ");                
           length = keyboard.nextDouble();                
           System.out.print("Enter the width of the rectangle: ");                
           width = keyboard.nextDouble(); 
 
           value = rectangleArea(length, width);
           // TASK #3 Call the rectangle 
           //Area method and store the result in the value variable  
           System.out.println("The area of the rectangle is " + value);               
      break; 
                       
    case 3: 
      System.out.print("Enter the height of the triangle: ");                
      height = keyboard.nextDouble();                
      System.out.print("Enter the base of the triangle: ");                
      base = keyboard.nextDouble(); 
       value = triangleArea(height, base);
      // TASK #3 Call the triangle 
 // area method and store the result in the value variable  
      System.out.println("The area of the triangle is " + triangleArea(height,base));           
      break; 
                       
    case 4: 
      System.out.print("Enter the radius of the circle: ");                
      radius = keyboard.nextDouble();
      
      value = circumference(radius);
      // TASK #3 Call the circumference method and
//store the result in the value variable 
 System.out.println("The circumference of the circle is " + circumference(radius));                     
break;            
            
     case 5: 
       System.out.print("Enter the length of the rectangle: ");               
       length = keyboard.nextDouble();                
       System.out.print("Enter the width of the rectangle: ");                
       width = keyboard.nextDouble(); 
 
       value = rectanglePerimeter(length, width);
       //store the result in the value variable  
       System.out.println("The perimeter of the rectangle is "+value);  
  break;           
case 6: 
  System.out.print("Enter the length of side 1 of the triangle: ");                
  side1 = keyboard.nextDouble(); 
  System.out.print("Enter the length of side 2 of the triangle: ");                
  side2 = keyboard.nextDouble(); 
  System.out.print("Enter the length of side 3 of the triangle: ");                
  side3 = keyboard.nextDouble(); 
 
  value = trianglePerimeter(side1, side2, side3);
  // TASK #3 Call the perimeter method and 
  //store the result in the value variable  
  System.out.println("The perieter of the triangle is " + value);                
  break;
  
          
 default: 
   System.out.println("You did not enter a valid choice.");          
      } 
   keyboard.nextLine(); // Consume the new line 
   System.out.println("Do you want to exit the program (Y/N)?: ");          
   String answer = keyboard.nextLine();          
   letter = answer.charAt(0); 
} while(letter != 'Y' && letter != 'y');
 } 
 
public static void printMenu(){
	  System.out.println("This is geometry caclulator");
	  System.out.println("Choose vhat you like to caculate");
	  System.out.println("1. Find area of Circle");
	  System.out.println("2. Find  area of a Rectangle");
	  System.out.println("3. Find area of a Triangle");
	  System.out.println("4. Find circumfrence of Circle");
	  System.out.println("5. Find perimeter of a rectangle");
	  System.out.println("6. Find perimeter of triangle");
  }
  
  public static double circleArea(double r){
	  double area;
	  area = Math.PI*Math.pow(r, 2);
	  return area;
  }
  
  public static double rectangleArea(double l, double w){
	  double area;
	  area = l*w;
	  return area;	  
  }
  
  public static double triangleArea(double h, double b){
	  return (h/b) * 0.5;
  }
  
  public static double circumference(double r){
	  return 2*Math.PI*r;
  }
  
  public static double rectanglePerimeter(double l, double w){
	return (2*l) + (2*w);
	  
  }
  
  public static double trianglePerimeter(double a, double b, double c){
	  return a + b + c;
  }
  // TASK #2 Create the value-returning methods here 
  // TASK #3 Call the methods
}
 
