package solid.principle.likshov.substitute;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class FixedDepositAccount extends Account {

	@Override
	public void deposit(double amount) {
		this.accountalance += amount;
		
	}
}
