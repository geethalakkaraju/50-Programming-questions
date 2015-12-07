package progquestions;
import java.util.*;

public class StringReversal {
	
	public static void main(String[] args) {
		
		String original, reverse = "";
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the string: ");
		
	    original = s.nextLine();
		
		int length = original.length();
		
		for (int i = length - 1; i >= 0; i--) {
			
			reverse = reverse + original.charAt(i);
			
		}
		
		System.out.println("The reverse of string entered : " + reverse);
		
	}

}
