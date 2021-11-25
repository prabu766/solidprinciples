package solid.principle.intface.segregation;

/**
 * 
 * @author prabhuddha.bhashitha
 * Interface Segregation principle means, Child class should not be forced to implement irrelevant behaviors of an interfaces.
 * Check the comments in Person interface for the explanation
 */
public class InterfaceSegregationMain {
	
	public static void main(String[] args) {
		Person p = new Employee();
		System.out.println(p.getAge());
	}
}
