package unl.cse.bank;

public class SavingsAccount extends BankAccount {

	private double apr;
	
//	public Person getOwner() {
//		return new Person("Chris", "Bourke");
//	}

	public double getAnnualEarnings() {
		return this.getBalance() * (Math.pow(1 + this.apr / 12, 12) - 1);
	}

	public SavingsAccount(String accountId, double balance, Person owner, double apr) {
		super(accountId, balance, owner);
		if (apr < 0) {
			throw new IllegalArgumentException("APRs cannot be negative");
		}
		this.apr = apr;
	}

	public double getRiskRatio() {
		return 0.5;
	}
}
