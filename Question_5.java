package Assignment8_Methods;

import java.util.Scanner;

public class Question_5 {
	//Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

	//for example :
	//sign(5) => 1
	//sign(-30)=> -1
	//sign(0) => 0

	//sign gets an int parameter.

	//print out 1,-1 or 0 depending on the input

	//the parameter should be entered by user (create a scanner object)
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int number = scan.nextInt();
				
        sign(number);		
	}
	public static void sign(int number) {
		  
	    if ( number>= 1) {
	      System.out.println("sign"+ "(" + number+ ")"+" => 1");
	    	  
	      } else if (number <= -1) {
	    	  System.out.println("sign"+ "(" + number+ ")"+" => -1");
		    
	    } else if (number >=0){
	    	System.out.println("sign"+ "(" + number+ ")"+" => 0");
	    }else {
	    	System.out.println(" ");
	    }
	    	
	    }

	
	  }
	
	
	
	
	
	

