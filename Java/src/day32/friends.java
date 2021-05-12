package day32;

import java.util.ArrayList;

public class friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Friends1 = new ArrayList<>();
		ArrayList<String> Friends2 = new ArrayList<>();
		
		
		Friends1.add("mike");
		Friends1.add("john");
		Friends1.add("ela");
		Friends1.add("mola");
		
		
		
		Friends2.add("ola");
		Friends2.add("kola");
		Friends2.add("sila");
		Friends2.add("gila");
		Friends2.add("olmila");
		
		
		if(Friends1.equals(Friends2)) {
			System.out.println("same friends");
		}else {
		System.out.println("not friends");
	}
}
}