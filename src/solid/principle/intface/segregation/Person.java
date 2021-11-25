package solid.principle.intface.segregation;

/**
 * 
 * @author prabhuddha.bhashitha
 * See below "getEngineCapacity" method violates the principle of Interface Segregation, because the engine capacity is not relevant to the Person class.
 * To fix this, segregate "getEngineCapacity" method to a different interface called "Car"
 * 
 * In a way this is much similar to the Single responsibility principle, but in the interface level
 *
 */
public interface Person {
	
	String getName();
	
	int getAge();
	
	//int getEngineCapacity();// SHOULD NOT BE IN THIS INTERFACE

}
