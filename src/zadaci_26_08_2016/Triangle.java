package zadaci_26_08_2016;

public class Triangle extends GeometricObject {
	
	//private data fields
	private double side1;
	private double side2;
	private double side3;
	
	//no-arg konstruktor
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	//konstruktor sa argumentima, stranicama
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//getters
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	//povrsina trougla
	public double getArea() {
		return Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)- side1)*((getPerimeter()/2)- side2)*((getPerimeter()/2)- side3));
	}
	//obim
	public double getPerimeter() {
		return side1+side2+side3;
	}
	//opis osobina
	@Override
	public String toString() {
		return super.toString()+"side1="+side1+" side2="+side2+" side3="+side3;		
	}

}
