package solid.principle.dependency.inversion;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public abstract class Account {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
