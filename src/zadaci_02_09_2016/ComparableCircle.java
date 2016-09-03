package zadaci_02_09_2016;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public int compareTo(ComparableCircle o) {
        if (getArea() == o.getArea())
            return 0;
        else if (getArea() > o.getArea())
            return 1;
        else
            return -1;
	}
}
