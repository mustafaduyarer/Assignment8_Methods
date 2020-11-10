package Assignment8_Methods;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		int num, Output;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter number : ");
	      num = sc.nextInt();
	      
	      Output = cube(num);
	      System.out.println("Output : " + Output);
	      sc.close();
	   }
	   public static int cube(int a)
	   {
	      int Output = a*a*a ;
	      return Output;

	}

}
