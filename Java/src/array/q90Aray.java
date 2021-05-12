package array;

public class q90Aray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] car = {"lada", "bmw","mercedec", "skada"};
		
		for(int i=0; i<car.length; i++) {
			
			if(car[i].equals("honda")) {
				
				System.out.println(" i found your car");
				
				break;
			}else {
				System.out.println("could not fund your car");
				break;
				
			}
		}
	}

}
