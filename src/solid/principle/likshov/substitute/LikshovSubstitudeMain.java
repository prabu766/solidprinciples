package solid.principle.likshov.substitute;

/**
 * 
 * @author prabhuddha.bhashitha
 * Liskov substitution principle means a parent class should be substitutable from a child class. 
 * In other words, if any class inheriting a another class, the child class should be a behavioral sub-type, NOT ONLY a property inheritance.
 * In below example, if we see the "doDeposit","doWithdrawal" methods accepts a abstract type of "Account"
 * So ALL THE CHILD CLASSES INHERITED BY ACCOUNT CLASS SHOULD INHERIT THE SAME BEHAVIOUR. i.e. All should have the doDeposit,doWithdrawal implementations
 * 
 * Let's say the bank wants to introduce an account(FixedDepositAccount) which can't to withdrawals.
 * Thinking FixedDepositAccount IS-A account if we inherit Account class in FixedDepositAccount, it breaks the Liskov substitution principle, because it does not support a one method in the parent class.
 * 
 * To re-factor this, we have to introduce intermediate class as  WithdrawableAccount and CurrentAccount and Savings Account should be inherited from that class
 * 
 * NOTE: Liskov substitution principle is connected with Open/Closed principle
 * 
 * So the base line of this is
 * "To be substitutable, the subtype must behave like its supertype."
 */
public class LikshovSubstitudeMain {
	
	public static void main(String[] args) {
		BankWidrawalService ws = new BankWidrawalService();
		
		WithdrawableAccount currentAcc = new CurrentAccount();
		WithdrawableAccount savingsAcc = new SavingsAccount();
		
		ws.doDeposit(currentAcc, 100);
		ws.doWithdrawal(currentAcc, 10);
		System.out.println(currentAcc.getAccountalance());
		
		ws.doDeposit(savingsAcc, 1000);
		ws.doWithdrawal(savingsAcc, 10);
		System.out.println(savingsAcc.getAccountalance());
		
	}
}
