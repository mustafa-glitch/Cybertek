package method;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		System.out.println(sum(9,9));
   int x = sum(10,0,0,0);
   System.out.println(x);
	}
	
    public static int sum(int a, int b) {
    	
    	return a+b;
    }	
    

  public static int sum(int a, int b, int c) {
    
	  return a+b+c;
    
  
   }


   public static int sum(int a, int b, int c, int d) {
	   
	   return a+b+c+d;
   }
}