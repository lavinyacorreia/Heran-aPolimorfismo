package applications;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramSobreposicao {

	public static void main(String[] args) {
		Account acc = new Account(1000, "Marcos", 1000.0);		
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingsAccount(1003, "Latica", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1004, "Lupita", 1000.0, 0.01);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
	}

}
