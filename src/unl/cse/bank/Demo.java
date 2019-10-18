package unl.cse.bank;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static double sumTotal(List<BankAccount> myCheckingAccounts) {
		double total = 0;
		for(BankAccount a: myCheckingAccounts) {
			total += a.getBalance();
		}
		return total;
	}

	public static void main(String[] args) {
		Person me = new Person("Chris", "Bourke");
		SavingsAccount xmasAccount = new SavingsAccount("ABC001", 100.0, me, 0.02);
		SavingsAccount lifeAccount = new SavingsAccount("ABC002", 125.0, me, 0.05);
		CheckingAccount workAccount = new CheckingAccount("ABC003", 199.0, me, 0.01);
		CheckingAccount secretAccount = new CheckingAccount("ABC004", 63.0, me, 0.00);
//		BankAccount what  = new BankAccount("Wat001", 1000000, me);
		List<BankAccount> myAccounts = new ArrayList<>();
		myAccounts.add(workAccount);
		myAccounts.add(secretAccount);
		myAccounts.add(xmasAccount);
		myAccounts.add(lifeAccount);
		double total = sumTotal(myAccounts);
		System.out.println(total);
	}

}
