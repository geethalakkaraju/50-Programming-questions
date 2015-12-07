package progquestions;

/*
 This program swaps 2 numbers with a temp variable and without a third variableS
 */

public class SwapNumbers {
	
	
	public static void main(String[] args) {
		
		int x = 8;
		int y = 9;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
/*	    int temp;
		temp = x;
		x = y;
		y = temp;
		
		*/
		
		System.out.println(x + ", " + y);
	}
		
}
