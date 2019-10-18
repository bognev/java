package unl.cse.bank;

public abstract class BankAccount implements Account {

	private String accountId;
	private double balance;
	private Person owner;

	public BankAccount(String accountId, double balance, Person owner) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.owner = owner;
	}

	public abstract double getRiskRatio();

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public final Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
