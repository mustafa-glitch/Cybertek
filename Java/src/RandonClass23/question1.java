package RandonClass23;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc hi hohihi";  
    
int counter=0;

for(int i=0;i<str.length()-1;i++) {  //9<10    	
if(str.substring(i, i+2).equals("hi")) {    


counter++;
}

}

System.out.println(counter);
}
}