package EXERCISE_MYSELF;

public class ex2 {

	public static void main(String[] args) {
		
    specialnumber(27, true);
    specialnumber(23, true);
    specialnumber(24, true);
    
	}
     public static void specialnumber(int num1, boolean notspecial) {
    	 
     
     if(num1==11*2 || num1==11*2+1 || num1==11) {
    	 System.out.println(true);
     }else {
    	 System.out.println(false);
    	 
}
}
}