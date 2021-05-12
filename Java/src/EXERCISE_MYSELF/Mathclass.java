package EXERCISE_MYSELF;

public class Mathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberAsString = "2018";
		System.out.println(numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);

		numberAsString = numberAsString + 1;
		number = number + 1;
		
		System.out.println(numberAsString);
		System.out.println(number);

		

		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		long number3=(long) Double.parseDouble(numberAsString);
		System.out.println(number3);
		
		
		
	}

}
