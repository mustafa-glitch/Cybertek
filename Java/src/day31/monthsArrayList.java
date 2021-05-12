package day31;

import java.util.ArrayList;

public class monthsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<String> list1 = new ArrayList();
	
	list1.add("jan");
	list1.add("feb");
	list1.add("march");
	list1.add("april");
	list1.add("may");
	list1.add("june");
	list1.add("july");
	list1.add("augst");
	
	
	System.out.println(list1.toString());
	
	
	
	
	ArrayList<String> list2 = list1;
	
	//copy all values from list one//
	
	
	ArrayList<String> months = new ArrayList(list1);
	
	months.add("September");
	months.add("nov");
	months.add("oc");
	months.add("dec");
	months.add("newyear");
	
	
	System.out.println(months);
	
	
	//how to check if feb is in the sec position//
	
	System.out.println(months.get(1).equals("feb"));
	
	
	if(months.containsAll(list1)) {
		
		System.out.println("month has alll the listing");
	
	
	
	}else {
		System.out.println("missing");
	}
	
	}

}
