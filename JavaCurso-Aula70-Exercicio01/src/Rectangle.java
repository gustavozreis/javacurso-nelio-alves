
public class Rectangle {
	
	double width;
	double height;
	
	public Rectangle(double recWidth, double recHeight) {
		width = recWidth;
		height = recHeight;
	}
	
	double recArea;
	double recPerimeter;
	double recDiagonal;
	
	//fun��o que retorna �rea do ret�ngulo
	public double recArea() {
		return width * height;		
	}
	
	//fun��o que retorna per�metro do ret�ngulo
	public double recPerimeter() {
		return width * 2 + height * 2;
	}
	
	//fun��o que retorna a diagonal do ret�ngulo
	public double recDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public void resultado() {
		System.out.println("AREA = " + recArea());
		System.out.println("PERIMETER = " + recPerimeter());
		System.out.println("DIAGONAL = " + recDiagonal());
	}

	
}
