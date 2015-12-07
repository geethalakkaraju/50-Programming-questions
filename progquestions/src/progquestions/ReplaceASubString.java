package progquestions;

public class ReplaceASubString {
	

	
	public static void main(String[] args) {
		
		String str = "Replace the dog with cat";
		
		String orig = "dog";
		String replace = "cat";
		
		int origIndex = 0;
		int endIndex = 0;
		
		origIndex = str.indexOf("dog");
		endIndex = origIndex + orig.length();
		
		str = str.substring(0, origIndex) + replace + str.substring(endIndex);
		
		System.out.println("The modified string is " + str);
		
		
	}

}
