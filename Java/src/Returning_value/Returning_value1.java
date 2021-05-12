package Returning_value;

public class Returning_value1 {

	public static void main(String[] args) {
	

	}
    public static double calcfeetinchtocantmeters(double feet, double inches, double cantmeters) {
    	
    	if(feet<=0 || (inches<0 || inches>12)) {
    		return-1;
    		
    	}
    	 double centimeters = (feet*12)*2.54;
    	 System.out.println(feet+ "feet" + inches+ "inches" + cantmeters + "cantimeters");
    	 
    	  
    	 return cantmeters;
    }

    public static double calcfeetinchtocantmeters(double inches) {
    	
    	
    	if(inches<0) {
    		
    		
    	}
		return inches = -2;
		
}










}
