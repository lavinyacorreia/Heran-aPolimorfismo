package applications;

import entities.Account;
import entities.SavingsAccount;

public class ProgramPolimorfismo {

	public static void main(String[] args) {
		// POLIMORFISMO - muitas formas, dois objetos do mesmo TIPO mas com comportamentos diferentes
		Account x = new Account(1044, "Helena", 1000.0);
		Account y = new SavingsAccount(1059,"Felipe", 1000.0, 0.01);
		
		x.withdraw(50);
		y.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
