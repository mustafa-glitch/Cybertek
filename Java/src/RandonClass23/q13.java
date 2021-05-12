package RandonClass23;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = " hi there The";
		String newstring="";
		for(int i=0; i<str.length(); i++) {
			
			newstring= newstring+str.substring(i,i+1).concat(str.substring(i,i+1));
		}
		
		System.out.println(newstring);
	}
	

}
