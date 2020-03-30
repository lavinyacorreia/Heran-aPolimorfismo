package applications;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0); 
		
	// UPCASTING - objeto do tipo BusinessAccount(subclasse) e atribuí-lo à variável Account(superclasse)
	
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Lavinya", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Jenifer", 0.0, 0.01);
	
	// DOWNCASTING - objeto da superclasse para a subclasse (é necessário forçar a operação)
		 
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		//BusinessAccount acc4 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
