package day33_Class_Objects_Constructors;

public class Student_Test {

	public static void main(String[] args) {
		
		Student s1= new Student("mustafa",19,"male",2009,"java","cybertek");
		Student s2= new Student("mola",33,"female",1998,"python","cybertek");
		
		
		s1.Attendinglecture();
		s1.attendingLab();
		
	}

}
