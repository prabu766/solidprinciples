package solid.principle.likshov.substitute;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class BankWidrawalService {

	
	public void doWithdrawal(WithdrawableAccount account, double amount) {
		account.withdraw(amount);
	}
	
	public void doDeposit(WithdrawableAccount account, double amount) {
		account.deposit(amount);
	}
	
}
