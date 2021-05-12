package RETURNmethod;

public class returnEx2 {

	public static void main(String[] args) {
		
		if(lastdigit(55,113)) {
			System.out.println("they have the same last digit");
			
		}else {
			System.out.println("they do not have the same last digit");
		}
  
	}
	
	
     public static boolean lastdigit (int num1, int num2) {
    	
    	 if((num1%10)==(num2%10)) {
    		 return true;
    		 
    	  }else {
    		 return false;
    	 }
     }
}
