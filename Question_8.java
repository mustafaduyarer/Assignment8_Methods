package Assignment8_Methods;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    System.out.print("Input: ");
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){

		  int [] arr =new int[num+1];
		  arr[1]=1;
		  for(int i=0; i<=arr.length-3 ; i++){
		    arr[i+2] = arr[i] + arr[i+1];
		    
		  }
		  System.out.println(arr[arr.length-1]);
		   }
		


	}


