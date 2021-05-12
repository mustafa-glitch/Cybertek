package day32;

import java.util.ArrayList;

public class customMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numlist = new ArrayList<>();
		
		numlist.add(10);
		numlist.add(20);
		numlist.add(30);
		numlist.add(50);
		numlist.add(60);
		numlist.add(70);
		numlist.add(80);
		numlist.add(90);
		
		printlist(numlist);
		
		ArrayList<Double> mylist = new ArrayList<>();
		
		mylist.add(12.3);
		mylist.add(12.3);
		mylist.add(14.3);
		mylist.add(15.3);
		mylist.add(17.3);
		
		double sum = sumlist(mylist);
		System.out.println(Math.round(sum));
	}

	private static double sumlist(ArrayList<Double> mylist1) {
		double sum =0;
		for(Double each: mylist1) {
			sum=sum+each;
		}
		return sum;
	}

	public static void printlist(ArrayList<Integer> nums) {
		// TODO Auto-generated method stub
		
		for(Integer n: nums) {
			System.out.println("nums are"+n);
			
			
		}
	}

}
