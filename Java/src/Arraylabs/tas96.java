package Arraylabs;

public class tas96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x []= {1,2,3};
		int xx[]= {6,4,6};
		int xxx[] = {4,2,1,6};
		
		System.out.println(firstlast6(x));
		System.out.println(firstlast6(xx));
		System.out.println(firstlast6(xxx));
	}

	public static boolean firstlast6(int [] arr) {
		
		
		if(arr.length<1) {
			return false;
			
		}
		if(arr[0]==6 || arr[arr.length-1] == 6) {
			
			return true;
			
		}else {
			return false;
		}
		
		
	}
}
