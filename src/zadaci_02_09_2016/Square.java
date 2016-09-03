package zadaci_02_09_2016;

public class Square extends GeometricObject implements Colorable{
	
	private double side;
	private String colorSide1;
	private String colorSide2;
	private String colorSide3;
	private String colorSide4;

	//no-arg konstruktor
	public Square() {
		this(1.0, false);
		
	}
	//konstruktor sa argumentima
	public Square(double side, boolean filled) {
		this.side = side;
		setFilled(filled);
		// ako je filled true, upisi boje za kvadrat i stranice
		if (filled) {
			howToColor();
		}		
	}
	//getters and setters
    public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public String getColorSide1() {
		return colorSide1;
	}
	public void setColorSide1(String colorSide1) {
		this.colorSide1 = colorSide1;
	}
	public String getColorSide2() {
		return colorSide2;
	}
	public void setColorSide2(String colorSide2) {
		this.colorSide2 = colorSide2;
	}
	public String getColorSide3() {
		return colorSide3;
	}
	public void setColorSide3(String colorSide3) {
		this.colorSide3 = colorSide3;
	}
	public String getColorSide4() {
		return colorSide4;
	}
	public void setColorSide4(String colorSide4) {
		this.colorSide4 = colorSide4;
	}
	//Implement the getArea() method
	@Override
    public double getArea() {
        return side * side;
    }
	//Implement getPerimeter() method
    @Override
    public double getPerimeter() {
        return side * 4;
    }
    //Implement howToColor() method
    @Override
    public void howToColor() {
    	colorSide1 = "red";
    	colorSide2 = "blue";
    	colorSide3 = "black";
    	colorSide4 = "green";
    }
    //to string ispis
    @Override
	public String toString() {
		if (isFilled()) {
			return "Color of first side: " + colorSide1
					+ "\ncolor of second side: " + colorSide2
					+ "\ncolor of third side: " + colorSide3
					+ "\ncolor of fourth side: " + colorSide4 + "\n";
		} else {
			return "Square is not colored\n";
		}
	}

}
