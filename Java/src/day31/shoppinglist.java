package day31;

import java.util.ArrayList;

public class shoppinglist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> shoppinglist = new ArrayList();
		
		shoppinglist.add("sauy sauce");
		shoppinglist.add("bread");
		shoppinglist.add("cheese");
		shoppinglist.add("chicken");
		shoppinglist.add("meat");
		shoppinglist.add("oil");
		shoppinglist.add("paper");
		int count = shoppinglist.size();
		System.out.println(shoppinglist.size());
		System.out.println(shoppinglist.toString());
		
		//print first last item in single line//
		
		System.out.println(shoppinglist.get(0)+" "+shoppinglist.get(count-1));
		
		shoppinglist.remove(0);
		System.out.println(shoppinglist.toString());
		
		//clear all items//
		
		shoppinglist.clear();
		System.out.println(shoppinglist.toString());
		
	}

}
