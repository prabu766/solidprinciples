package solid.principle.likshov.substitute;

/**
 * This class is introduce to maintain the Liskov substitution principle
 * @author prabhuddha.bhashitha
 *
 */
public abstract class WithdrawableAccount extends Account{
	
	public abstract void withdraw(double amount);
}
