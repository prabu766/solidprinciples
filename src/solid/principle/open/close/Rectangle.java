package solid.principle.open.close;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class Rectangle extends Shape {

	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}

	@Override
	public String getShapeName() {
		return "Rectangle";
	}
	
	
}
