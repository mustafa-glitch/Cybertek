package array;

public class FOReachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products = {"shirt","jeans","gloves"};
		
		double[] prices = {10,20,30,40,50,66};
		
		for(int i=0; i<products.length; i++) {
			
			System.out.println(products[i]);
		}
		
		for(String prod: products) {
			
			System.out.println(prod);
		}
		
for(int i=products.length-1; i>=0; i--) {
			
			System.out.println(prices[i]);
		}
	
	
   
}
	}


