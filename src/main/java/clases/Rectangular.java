package clases;

public class Rectangular extends GeometricFigure {
	private double width,heigth;
	public Rectangular(double width,double heigth) {
		this.width=width;
		this.heigth=heigth;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width*heigth;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+heigth);
	}

}
