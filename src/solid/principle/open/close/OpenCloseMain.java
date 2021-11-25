package solid.principle.open.close;

/**
 * 
 * @author prabhuddha.bhashitha
 * This class is to show Single OpenClose principle
 */
public class OpenCloseMain {
	
	
	/**
	 * If we analyze this method's body the logic is OPEN for extension but CLOSED for modification. 
	 * i.e. If any one wants to introduce a new Shape and calculate the area, there is NO need to change the business logic here. 
	 * We can still extend the solution by adding a new class and writing implementing the "calculateArea" logic in that class.
	 * This is called OPEN/CLOSED principle.
	 * ==========================================================================================================================
	 * NOTE : IF we do NOT follow the OPEN/CLOSE principle, it'll be a series of instance of operators. 
	 * If there is a new Shape, you MUST change the this main business logic. 
	 *	if(shape instanceOf Circle){
	 *	  
	 *	}if(shape instanceOf Square){
	 *	  
	 *	}if(shape instanceOf Rectangle){
	 *	  
	 *	}
	 * @param shape
	 * @return
	 */
	public double calculateArea(Shape shape) {
		return shape.calculateArea();
		
	}

	public static void main(String[] args) {
		OpenCloseMain ocMain = new OpenCloseMain();
		
		Shape shape = new Circle(3);
		System.out.println(shape.getShapeName() +" Area is "+ ocMain.calculateArea(shape));
		
		shape = new Square(10,12);
		System.out.println(shape.getShapeName() +" Area is "+ ocMain.calculateArea(shape));
		
		shape = new Rectangle(300,700);
		System.out.println(shape.getShapeName() +" Area is "+ ocMain.calculateArea(shape));
	}
	
}
