package solid.principle.dependency.inversion;

/**
 * 
 * @author prabhuddha.bhashitha
 * The Dependency Inversion principle means,
 * High-level modules(classes) should not depend on Low level classes, both should depend on Abstractions.
 * If we see below example DependencyInversionMain (High-level module) and low-level modules are CurrentAccount and SavingsAccount.
 * In line 17,18 it creates direct objects of the low-level modules which violates the principle
 * 
 * 
 */
public class DependencyInversionMain {

	public static void main(String[] args) {
		
		// If we create concrete class objects directly as below, it is DependencyInversionMain class is tightly coupled with CurrentAccount,SavingsAccount classes
		// It breaks the Dependency inversion principle. 
		CurrentAccount currentAccount = new CurrentAccount();
		SavingsAccount savingsAccount = new SavingsAccount();
		
		DependencyInversionMain main = new DependencyInversionMain();
		
		//================This kind of code VIOLATES THE DEPENDENCY INVERSION PRINCIPLE=================//
		main.getCurrentAccountBalance(currentAccount);
		main.getSavingsAccountBalance(savingsAccount);
		//==============================================================================================//
		
		
		//This is the correct code which used an Abstract class
		main.getBalance(currentAccount);
		main.getBalance(savingsAccount);
		
	}

	//================This kind of code VIOLATES THE DEPENDENCY INVERSION PRINCIPLE=================//
	//At this level it assumes there is no abstract class as "Account"
	public double getCurrentAccountBalance(CurrentAccount currentAccount) {
		return currentAccount.getBalance();
	}
	
	public double getSavingsAccountBalance(SavingsAccount savingsAccount) {
		return savingsAccount.getBalance();
	}
	//==============================================================================================//
	
	//SHOULD write like below
	public double getBalance(Account account) {
		return account.getBalance();
	}
}


