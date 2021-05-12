package Object_class;

public class bankAccount {

	
	double balance;
	String accountHolder;
	int AccountNumber;
	
	
	public void deposit(double amount) {
		System.out.println("deposit $"+ amount+ "to" + AccountNumber);
		
		balance+=amount;
		
	}
	public void withdraw(double amount) {
		
		System.out.println("withdrawing $"+ amount + "from" + AccountNumber);
		
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
		}
		}
		
		public void showbalance() {
			System.out.println(".............");
			
			System.out.println("account number"+accountHolder);
			System.out.println("AcountNumberr"+AccountNumber);
			System.out.println("balance$"+balance);
			System.out.println("................");
			
			
		}
		
		public void charge(double price, String item) {
			
		if (balance>price) {
			System.out.println("buying"+item+"for$"+price+"from"+AccountNumber);
		
		balance-=price;
		
		
		} else {
		System.out.println("insufficicant fund to buy" + item +"from"+AccountNumber);
				
			}
		}
		
		}
		
	
	

