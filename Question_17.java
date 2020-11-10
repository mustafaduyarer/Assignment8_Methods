package Assignment8_Methods;

public class Question_17 {
public static void main(String[] args) {
	boolean x = getThunderBlazz(true, false, 11, 12, 13);
	System.out.println(x);
}

		  public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
		  , int ingredient2, int ingredient3)
		  {
		    
		    if(available){
		      return true;
		    }
		    if(gift){
		      return true;
		    }
		    if(ingredient1==1 && ingredient2==2 && ingredient3==3){
		      return true; 
		    }
		    if(ingredient1==3 && ingredient2==1 && ingredient3==2){
		      return true; 
		    }
		    return false;
		  }
		}

