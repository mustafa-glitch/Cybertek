package overLoading;

public class overloading1 {

	public static void main(String[] args) {
		

		double gallons;		
		double liters;		

		gallons = 15;	

		liters = gallons *56.78/12; 


		
		System.out.println(gallons + " gallons is " + liters + " liters.");
		
		double currentyear=2020;
		String name="ozzy";
		double birthyear= 1998;
		 
		double age = currentyear-birthyear;
		
		System.out.println("Hello Ozzy!, based on your input, you age is" +age);
		
		
		double height=7.9;
		double width=4.5;
		
		double area = height*width;
		
		
		
		
		System.out.println("area of the rectangle is"+" "+ " " + area);
		
		
		
		

	        System.out.println("fourth question is empty");
	        
	        
	        
	        
	         int hour=24;
	         double minute=34;
	         double second=60;
	         
	        
	         
	         int grams = 5;
	         int miligrams = grams * 100;
	         int Drink= grams * 4;
	         
	         if(grams <= 20) {
	             
	             System.out.println("Number of miligrams in drink: " + miligrams);
	             System.out.println("It would take about " + Drink + " drinks for a lethal overdose");
	         
	
	         
	int price=55;
    int change =100-price;
    int quarter=change/25;
    int Dimes=(change%25)/10;
    int Nickles=(change%25)%10/5;

	             System.out.println("Your change is "+quarter+" quarters, "+Dimes+" dimes, and "+Nickles+" nickles");
	         
	         
	    }

	
}


}
