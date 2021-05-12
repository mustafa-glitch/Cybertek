package RETURNmethod;

public class YearsAfterRetirment {

public static void main(String[] args) {
		
		yearsUntilRetirement("Mike",1950);

	}
	
	
	public static void yearsUntilRetirement(String name,int year) {  
		
		 
		
		int retiremenAge = 65 - calculateAge(year);
		
		System.out.println(name  + " retires in " + retiremenAge + " years");
		
		
		
	}
	
	
	public static int calculateAge(int yearBirth) {
		
		return 2019-yearBirth;
		
	}
	
	


}