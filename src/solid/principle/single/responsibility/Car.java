package solid.principle.single.responsibility;

/**
 * 
 * @author prabhuddha.bhashitha
 * This class is to show Single Responsibility principle. 
 * This principle describes, There must be only ONE reason to change a class. In other words a single class must carry ONLY one responsibility
 * 
 * If we consider the "paymentMethod" property here, it VIOLATES the Single responsibility principle as the car buying payment method is NOT relevant to the Car class.
 * 
 */
public class Car {
	
	private int engineCapacity;
	private int manufactureYear;
	private String paymentMethod;//VIOLATES the Single responsibility principle
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
