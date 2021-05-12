package day33_Class_Objects_Constructors;

public class Student {

	String name;
	int age;
	String gender;
	int year;
	String course;
	String university;
	


public Student(String name, int age, String gender, int year, String course, String university) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.year = year;
	this.course = course;
	this.university = university;
}

public void submittingassignment() {
	System.out.println(name+"submitting asignment");
	
	
}
public void Attendinglecture() {
	System.out.println(name+"atteding lecture");
	
	
}


public void attendingLab() {
	System.out.println(name+"atending lab");
	


}
}

