package day31;

import java.util.ArrayList;

public class arraylis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an ArrayList
		
				ArrayList<String> names = new ArrayList<>();
				
				ArrayList<Integer> nums = new ArrayList<>();
				
				
				//Assigning values to arrayList
				
				names.add("Mike");
				names.add("Smith");
				names.add("John");
				names.add("Emmy");
				names.add("Evan");
				names.add("Mary");
				
				nums.add(99);
				nums.add(656);
				nums.add(100);
				nums.add(new Integer("100"));
				
				//Reading from arrayList
				
				System.out.println(names.get(0));
				System.out.println(names.get(1));
				System.out.println(names.get(2));
				
				System.out.println("Names count: " + names.size());
				System.out.println("Nums count: " + nums.size());
				
				System.out.println(names.toString());
				
	}

}
