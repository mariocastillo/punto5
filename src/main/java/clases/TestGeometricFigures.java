package clases;

public class TestGeometricFigures {

	public static void main(String[] args) {
		GeometricFigure rectangle= new Rectangular(5, 3);
		System.out.println("Rectangle Area "+ rectangle.calculateArea()+ "\nRectangle Perimeter "+rectangle.calculatePerimeter());
		GeometricFigure square= new Square(3);
		System.out.println("Square Area "+ square.calculateArea()+ "\nSquare Perimeter "+square.calculatePerimeter());
		GeometricFigure circle= new Circle(5);
		System.out.println("Circle Area "+ circle.calculateArea()+ "\nCircle Perimeter "+circle.calculatePerimeter());
		GeometricFigure circlewopi= new Circle(5, 3.15);
		System.out.println("Circle Area "+ circlewopi.calculateArea()+ "\nCircle Perimeter "+circlewopi.calculatePerimeter());

	}

}
