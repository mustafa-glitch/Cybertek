package method;

public class first_example_credit_Rating {

	public static void main(String[] args) {
		
		double salary=5000;
		int creditrating=9;
		
		if(salary>2000 && creditrating>=7) {
			qualify();
		}else {
			noqualify();
		}
			
		}
public static void qualify() {
	System.out.println("hello");
}
public static void noqualify() {
	System.out.println("sorry");
	

	}

}
