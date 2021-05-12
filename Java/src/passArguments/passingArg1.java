package passArguments;

public class passingArg1 {

	public static void main(String[] args) {
		int x = 10;
		
		displayvalue(20);
		displayvalue(x);
         displayvalue(x*4);
	}
    public static void displayvalue(int num) {
    
    System.out.println("the value is" + num);
  

     
    }
}