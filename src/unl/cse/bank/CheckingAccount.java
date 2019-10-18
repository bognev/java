package unl.cse.bank;

public class CheckingAccount extends BankAccount {
	double monthlyFee;
	
	public CheckingAccount(String accountId, double balance, Person owner, double monthlyFee) {
		super(accountId, balance, owner);
		this.monthlyFee = monthlyFee;
	}
	
	public double getRiskRatio() {
		return 0.5;
	}

	public double getAnnualEarnings() {
		return 0;
	}
}
