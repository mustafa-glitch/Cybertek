package day31;

import java.util.ArrayList;

public class arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList  <Integer> nums = new ArrayList();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(99);
		
		System.out.println(nums.toString());
		nums.remove(2);
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(99);
		
		nums.remove(n1);
		System.out.println(nums.toString());
	}

}
