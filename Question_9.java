package Assignment8_Methods;

import java.util.Scanner;

public class Question_9 {
	Scanner scan = new Scanner(System.in);
    System.out.println ("Input :") ;
    int num = scan.nextInt();
	 public int max(int x,int  max){
		    if(x<max){
		      return x;
		    }else{
		      return max;
		    }
	}

}
