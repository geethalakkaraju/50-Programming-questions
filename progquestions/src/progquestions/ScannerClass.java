package progquestions;

import java.util.*;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a number");
		
		int num1 = scan.nextInt();
		
		System.out.println("Input another number");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum of the numbers "+ sum);
		
	}

}
