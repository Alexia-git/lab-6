
public class CheckingAccount extends BankAccount
{
	 public static final double FEE = 0.15;
	 
	 public CheckingAccount(String name, double initalAmount) 
	 {
			super(name, initalAmount);
			setAccountNumber(getAccountNumber() + "-10");// concatenated with –10 
			
		}
		@Override
		public boolean withdraw(double amount) {
			double total = amount + FEE;
			return super.withdraw(total);
		}
	
	
	
	

}
