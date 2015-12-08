package abstractclassexample;

// This is the implementation of the shape subclass circle

public class Circle extends Shape implements ShapeConstants {
	
	private final double radius;
	private int sides;

	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public Circle (int sides, double radius)
	{
		this.sides = sides;
		this.radius = radius;
	}
	
	// override
	public double area ()
	{
		return pi * Math.pow(radius, 2);
	}
	
    // override	
	public double perimeter ()
	{
		return 2 * pi * radius;
	}

}
