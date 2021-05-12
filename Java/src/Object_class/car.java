package Object_class;

public class car {

	String make;
    int model;
    String currentspeed;
    String color;
    
    public void carinfo() {
    	
    String info = "car model" +make +"model" + model + "current speed," + currentspeed +"color" + color;
    
      System.out.println(info);
      
     
    }
   public void drive(){
	   System.out.println(model+"model");
	   
	   
	   
   }
   public void acceleration(int mph) {
	   currentspeed=currentspeed+mph;
	   
   }

}  
