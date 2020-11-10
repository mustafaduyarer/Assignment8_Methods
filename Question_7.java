package Assignment8_Methods;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	  int temp= num;
	  int newNum=0;
	  
	  while(temp !=0){
	    newNum=newNum*10 + temp%10;
	    temp=temp/10;
	  }
	   System.out.println(newNum==num); 
	    
	  }
	

	}


