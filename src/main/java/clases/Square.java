package clases;

public class Square extends GeometricFigure {
	private double edge;
	public Square(double edge) {
		this.edge=edge;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return edge*edge;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 4*edge;
	}

}
