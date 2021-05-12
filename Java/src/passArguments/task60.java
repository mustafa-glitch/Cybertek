package passArguments;

public class task60 {

	public static void main(String[] args) {
		calculater(6,3, "+");
        calculater(6,3, "-");
        calculater(6,3, "/");
        calculater(6-3,0,  "*");
	}
    public static void calculater(double num1, double num2, String operator ) {
    	
    	switch(operator) {
    	case "+":
    		System.out.println(num1+num2);
    	break;
	    
	    case "-":
		System.out.println(num1-num2);
		
		break;
	    case "/":
	    	System.out.println(num1/num2);
	    case "*":
	    	System.out.println(num1*num2);
	}
    	}
}
