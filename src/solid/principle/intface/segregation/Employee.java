package solid.principle.intface.segregation;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class Employee implements Person,Car {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Prabuddha";
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int getEngineCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
