package StringManipilation_3;

public class startEndswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statu1="Ms johnson";
	
		
		
		if(statu1.startsWith("Ms")) {
			
			System.out.println("somewoman");
		}
		if(statu1.startsWith("Mr")) {
			System.out.println("marriedman");
			
			if(statu1.startsWith("Dr")){
				System.out.println("doctor");
				
				if(statu1.isEmpty()) {
					System.out.println("no title or unknown");
					
					if(statu1.startsWith("Mrs")) {
						System.out.println("marriedwoman");
					}
				}
			}
			
			
		
			
		}
		
		
	}

}
