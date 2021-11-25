package solid.principle.likshov.substitute;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public abstract class Account {

	protected double accountalance;
	
	public abstract void deposit(double amount);
	
	public double getAccountalance() {
		return accountalance;
	}

	public void setAccountalance(double accountalance) {
		this.accountalance = accountalance;
	}
	
}
