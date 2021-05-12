package method;

public class lab5 {

	public static void main(String[] args) {
		
           caughtspeeding(60,false);
	      caughtspeeding(65,false);
	       caughtspeeding(65,true);
	}
      public static void caughtspeeding (int speed, boolean isbirthday) {
	
      
      if(isbirthday) {
    	  if(speed<=60) {
    		 
    	  System.out.println(0);
    	  
    	  
    	  }else if (speed>=66 && speed<=85) {
    		  
    		  System.out.println(1);
    	  
      }else if (speed>=86) {
    	  System.out.println(2);
      }
      }
      
      
      
      
      
      
      }
}
