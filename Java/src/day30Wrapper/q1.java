package day30Wrapper;

import java.util.Arrays;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String numberAstring ="2018";
	System.out.println(numberAstring);
	
	int number = Integer.parseInt(numberAstring);
	System.out.println(number);	
	
	numberAstring= numberAstring+1;
	number=number+1;
	
	System.out.println(numberAstring);
	System.out.println(number);
	
	String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
	
	String[] arr = str1.split("and ");
	
	
	arr = arr[1].split("degree");
	String degree = arr[0];
	double cell = Double.parseDouble(degree);
	System.out.println(cell);
	
	System.out.println(Character.isDigit('4'));
	
	
	}

	
}
