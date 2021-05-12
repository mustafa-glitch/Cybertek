package method;

public class deep_method {

	public static void main(String[] args) {
       System.out.println("i am starting in main");
       deep();
        System.out.println("i am  back in main");
        
	}
  public static void deep() {
	  
	  System.out.println("now i am in deep");
	  deeper();
	  System.out.println("i am back in deep");
	  
	  
  }
  public static void deeper() {
	  System.out.println("now i am in deeper");
	  
  }
  
}
