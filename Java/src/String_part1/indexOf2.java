package String_part1;

public class indexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String list = "html-java-eclipse-python-hello";
    int firstdash = list.indexOf("-");
    
    System.out.println(firstdash);
    
    int seconddash = list.indexOf("-",5);//Starting point//
    System.out.println(seconddash);
    
    int thirddash=list.indexOf("-",seconddash);
    System.out.println(thirddash);
    
    int lastdash=list.lastIndexOf("-");
    System.out.println(lastdash);
	}

}
