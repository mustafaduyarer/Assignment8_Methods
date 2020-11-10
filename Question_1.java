package Assignment8_Methods;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		
		
		
		int num1, num2, result;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter First number : ");
	      num1 = scan.nextInt();
	      System.out.println("Enter Second number : ");
	      num2 = scan.nextInt();
	      result = plus(num1, num2);
	      System.out.println("Result : " + result);
	      scan.close();
	   }
	   public static int plus(int a, int b)
	   {
	      int result = a + b;
	      return result;
		
		
		

}		
}
	
	

