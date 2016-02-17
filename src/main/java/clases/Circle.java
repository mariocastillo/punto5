package clases;

public class Circle extends GeometricFigure {
	private double radius;
	private double pi=Math.PI;
	public Circle(double radius) {
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius,double pi) {
		this.radius=radius;
		this.pi=pi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi*Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

}
