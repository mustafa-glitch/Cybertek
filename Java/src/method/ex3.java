package method;

public class ex3 {

	public static void main(String[] args) {
		 
   specialeleven(22);
   specialeleven(23);
   specialeleven(24);
	}
	
  public static void specialeleven(int number) {
	  
	  if(number==11*2 || number==11*2+1 || number==11) {
		  System.out.println("true");
	   
	  }else {
     
          System.out.println(false);
     }

	  }
  }