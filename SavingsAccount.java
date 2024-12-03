
public class SavingsAccount extends BankAccount
{
	private double rate = 0.025; //2.5%
	private int savingsNumber = 0;
	private String accountNumber;
	public SavingsAccount(String name, double initalAmount) {
		super(name,initalAmount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	public void postInterest() {
		double interest= getBalance() * (rate/12);
		deposit(interest);
	}
	  @Override
	 public String getAccountNumber() {
		  return this.accountNumber;
	    }
	 public SavingsAccount(SavingsAccount account, double initialBalance) {
	        super(account, initialBalance);
	        savingsNumber = account.savingsNumber + 1;
	        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	    }
}
	
	
