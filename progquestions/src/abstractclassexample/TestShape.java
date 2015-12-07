package abstractclassexample;

public class TestShape {
	
	public static void main(String[] args) {
		
		double radius = 5;
		int sides = 0;
		Shape circle = new Circle (sides, radius);
		double area = circle.area();
		double perimeter = circle.perimeter();
		System.out.println("area: " + area);
		System.out.println("perimeter: " + perimeter);
	}

}
