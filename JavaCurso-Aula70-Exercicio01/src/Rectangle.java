
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
	
	//função que retorna área do retângulo
	public double recArea() {
		return width * height;		
	}
	
	//função que retorna perímetro do retângulo
	public double recPerimeter() {
		return width * 2 + height * 2;
	}
	
	//função que retorna a diagonal do retângulo
	public double recDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public void resultado() {
		System.out.println("AREA = " + recArea());
		System.out.println("PERIMETER = " + recPerimeter());
		System.out.println("DIAGONAL = " + recDiagonal());
	}

	
}
