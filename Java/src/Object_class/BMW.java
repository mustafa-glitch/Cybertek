package Object_class;

public class BMW {

	
	 String make;
	 String model;
	 double price;
	 
	 public void showprice() {
		 
		 switch (model) {
		 case "3001":
			 price=4250;
			 break;
		 case "7421":
			 price=560;
			 
		 case"m3":
			 price=6500;
			 break;
			 default: System.out.println(model+"is not available");
			 price=0.0;
			 
		 
				 
		 }
	
		 System.out.println("price is"+price);
	 }
}
