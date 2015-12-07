package progquestions;

/*
 * This program accepts a string like "This is nice" and converts it to "This1 is2 nice3"
 */

public class AppendToSubString {
	
	public static void main(String[] args) {
		
		String example = new String();
		
		example = "This is nice";
		String [] array = example.split(" ");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + (i+1) + " ");
		}
						
	}
		
}
