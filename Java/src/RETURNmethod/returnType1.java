package RETURNmethod;

public class returnType1 {

	public static void main(String[] args) {
	
	double distance=distance(9000,6);
	
	System.out.println(distance);
	if(distance>600) {
		System.out.println("you have traveled a lot");
	
	}
	}

    public static int distance(int speed ,int time) {
    	int distance=speed*time;
    	
    	return distance;
    }

}
