package solid.principle.likshov.substitute;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class SavingsAccount extends WithdrawableAccount{

	@Override
	public void deposit(double amount) {
		this.accountalance += amount;
	}

	@Override
	public void withdraw(double amount) {
		this.accountalance -= amount;
	}
}
