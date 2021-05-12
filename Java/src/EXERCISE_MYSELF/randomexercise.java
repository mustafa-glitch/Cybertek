package EXERCISE_MYSELF;

import java.util.Random;



public class randomexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		int Random = rn.nextInt(10)+1;
	
	    System.out.println(Random);
	    

        Random rn1 = new Random();
        double dice=rn1.nextDouble();
        
	    System.out.println(dice);
	    
	    Random trfl = new Random();
	    Boolean Random1=trfl.nextBoolean();
	    
	
	    System.out.println(Random);
	    
	    Random hello =new Random();
	    Long Random11 = hello.nextLong();
	    System.out.println(Random11);
	}

}
