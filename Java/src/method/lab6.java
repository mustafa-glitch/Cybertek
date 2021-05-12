package method;

public class lab6 {

	public static void main(String[] args) {
		
		cigarParty(30, true);
		cigarParty(50, true);
		cigarParty(70, false);

	}
     public static void cigarParty(int numbercigars, boolean weekend) {
    	 
    	 if(weekend) {
    		if(numbercigars<40) {
    			System.out.println(true);
    			
    		}else {
    			System.out.println(false);
    			
    		}
    	 }else {
    		 if(numbercigars>=40 && numbercigars<=60) {
    			 System.out.println(true);
    			 
    		 }else {
    			 System.out.println(false);
    		 }
    	 }
	}
}
