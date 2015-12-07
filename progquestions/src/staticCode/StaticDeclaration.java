package staticCode;

public class StaticDeclaration {
	
   //1st static block
	
	static {
		 
		System.out.println("\n i'm static block 1..");
		setTestValue(2);
	}
	
	static {
		
		System.out.println("\n i'm static block 2..");
	}
	
	// static variable example
	
	private static int testValue;
	
	public int getTestValue() {
		return testValue;
	}
	
	//static method example
	
	public static void setTestValue (int testValue) {
		if (testValue > 0)
			StaticDeclaration.testValue = testValue;
		System.out.println("setTestValue method: " + testValue);
		
	}
	
	public static String testString;
	
	public static String getTestString(){
		return testString;
	}
	


}
