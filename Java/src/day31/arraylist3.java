package day31;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//languages
		//printsize arraylist
		//read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("arabic");
		languages.add("english");
		languages.add("german");
		languages.add("russian");
		languages.add("chinese");
		
		System.out.println("number of values"+languages.size());
		System.out.println(languages.toString());
		
		languages.add("russian");
		System.out.println(languages.toString());
		
		languages.add("swahili");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		
		System.out.println("size of the array is"+ ""+languages.size());
		
		
		
		
		
		
	}

}
