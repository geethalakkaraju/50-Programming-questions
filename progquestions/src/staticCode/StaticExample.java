package staticCode;

public class StaticExample {

	
	public static void main(String[] args) {
		
		StaticDeclaration.setTestValue(5);
		StaticDeclaration sd = new StaticDeclaration();
		System.out.println(sd.getTestString());
		
		System.out.println("Check if class and instance variables are same: ");
		System.out.println(StaticDeclaration.testString = sd.testString);
		System.out.println(" because sd.testString = StaticDeclaration.testString");


		
	}
}
