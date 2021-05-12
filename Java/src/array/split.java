package array;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "This is the Java classical method to take input, Introduced in"
				+ " JDK1.0. This method is used by wrapping the System.in (standard input"
				+ " stream) in an InputStreamReader which is wrapped in a BufferedReader, we "
				+ "can read input from the user in the command line. ";
		
		String[] array = str.split(" ");
		System.out.println(str.length());
	
	
	System.out.println("------------------");
	

	String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
	
	
	String[] infoArray1 = info1.split("password :");
	

	
	
	String pass1 = infoArray1[1].split(". Please")[0];

	System.out.println(pass1);
	
	
	System.out.println("==================");
	
	String hello = "hola this is , mustafa and here is your paswordcccchhhhccccdo not share with anyone";
	
	String[] myarray1 = hello.split("pasword");
	
	String passme = myarray1[1].split("do not share with anyone")[0];
		
	
	
	System.out.println(passme);
	
	} 

}
