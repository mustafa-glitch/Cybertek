package Object_class;

public class employee {

	
	String name;
	int salary;
	String jobtitle;
	
	
	public void work() {
		System.out.println("work" + jobtitle);
		
	}
	
	public void attenMeeting() {
		System.out.println(name+"attending the meeting");
		
		
	}
	
   public void introduce() {
	   
	   System.out.println("introduce"+ jobtitle);
   }

}