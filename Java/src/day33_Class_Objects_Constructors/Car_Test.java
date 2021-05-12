package day33_Class_Objects_Constructors;

public class Car_Test {

	public static void main(String[] args) {
		

		Car c1 = new Car();
		Car c2 = new Car("honda","civic",2009, 5000,"white");
		Car c3 = new Car("mercedes", "benz", 2021, 0,"black");
		
		
		
		System.out.println(c1.color);
		System.out.println(c1.make);
		System.out.println(c3.color);
				
	}

}
