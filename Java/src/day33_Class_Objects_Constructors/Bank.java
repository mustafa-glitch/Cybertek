package day33_Class_Objects_Constructors;

public class Bank {

	//instance variable
		double balance;
		
		//this constructor sets the starting balance to 0.0
		public Bank() {
			balance = 0.0;
		}
		
		//this constructor sets the starting balance to the value passes as an argument
		public Bank(double startBalance) {
			balance = startBalance;
		}
		
		//this constructor sets the starting balance to the value in the string argument
		public Bank(String str) {
			this.balance = Double.parseDouble(str);
		}
		
		public void deposit(String str) {
			balance = balance + Double.parseDouble(str);
		}
		
		public double getBalance() {
			return balance;
		}

	}