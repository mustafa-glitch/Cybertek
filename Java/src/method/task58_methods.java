package method;

public class task58_methods {

	public static void main(String[] args) {
		greaternumber();
		greaternumber();
	}
	
   public static void greaternumber() {
	   
	   int num1=11;
	   int num2=11;
	   
	   if(num1>num2) {
		   System.out.println("num1 is the greater");
	   } else if(num2>num1) {
		   System.out.println("num2 is the greater");
		   
		   
	   }else {
		   System.out.println("numbers are equal");
	   }
   }
}
