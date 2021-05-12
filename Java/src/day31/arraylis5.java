package day31;

import java.util.ArrayList;

public class arraylis5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> city = new ArrayList<>();
		
		city.add("istanbul");
		city.add("manila");
		city.add("beijing");
		city.add("texas");
		
		System.out.println(city.toString());
		
		//print each element using loop seperated by space
		
		for(String each: city) {
			
			System.out.println(city+" ");
			
			
		}
		
		for(int i=0; i<city.size(); i++) {
			
			System.out.println(city.get(i)+"");
			
			
		}
		
		System.out.println("removing istanbul");
		
		
		
		city.remove("istanbul");
		
		System.out.println(city.toString());

		System.out.println("adding paris");
		city.add(1,"paris");
		System.out.println(city.toString());
		
		System.out.println(city.indexOf("bursa"));
		
		city.clear();
		
		boolean empty = city.isEmpty();
		
		System.out.println(empty);
	}

}
