package clases;

public class Rectangular extends GeometricFigure {
	private double width,length;
	public Rectangular(double width,double length) {
		this.width=width;
		this.length=length;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

}
