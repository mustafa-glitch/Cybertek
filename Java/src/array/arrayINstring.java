package array;

public class arrayINstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] mycars = {"honda","mercedes", "toyota","skoda","tofas"};
		
		System.out.println(mycars[0].length());
		System.out.println(mycars[2].charAt(2));
	    System.out.println(mycars[3].trim());
	 System.out.println(mycars[1].substring(2, 5));
	 System.out.println(mycars[1]=="mercedes");
	
	 
	 System.out.println("---------------------------");
	 
	 for(int i =0; i<mycars.length; i++) {
		 
		 System.out.println(mycars[i].length());
	 }
	}

}
