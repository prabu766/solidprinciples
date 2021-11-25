package solid.principle.open.close;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return  Math.PI * Math.pow(radius,2);
	}
	@Override
	public String getShapeName() {
		return "Circle";
	}
	
	
}
