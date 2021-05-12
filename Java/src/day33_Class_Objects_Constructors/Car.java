package day33_Class_Objects_Constructors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	public Car() {
	
	model="honda";
	make="civic";
	year = 2009;
	mile = 9000;
	color = "black";
	
	}
	
	

	public Car(double mile, String color) {
		super();
		this.mile = mile;
		this.color = color;
	}



	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
}