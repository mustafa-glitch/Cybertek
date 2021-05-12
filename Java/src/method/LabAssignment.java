package method;

public class LabAssignment {

	public static void main(String[] args) {
		deerplay(100,false);
		deerplay(100,false);
		deerplay(1,true);

	}
    public static void deerplay (int temp, boolean summer) {
    	
    	
    	if(summer) {
    		if (temp<=60 && temp<100) {
    			System.out.println(true);
    			
    		
    			
    	}else {
    		System.out.println(false);
    		
    	}
    }else {
    		if(temp<60 && temp<90) {
    			System.out.println(true);
    			
    		}else {
    			System.out.println(false);
    			
    	}
    	
    	
    
    	}
}
    
}
