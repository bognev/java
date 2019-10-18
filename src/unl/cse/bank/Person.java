package unl.cse.bank;

import java.time.LocalDate;

public class Person {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	Adress address;
	LocalDate birthDate;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
}
