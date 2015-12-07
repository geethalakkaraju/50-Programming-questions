package progquestions;

import java.util.Scanner;

public class ReadDataFromConsole {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Input a number ");
		
		int i1 = scan.nextInt();
		
		System.out.println("Input a number ");
		
		int i2 = scan.nextInt();
		
		System.out.println("Dividing i1 by i2 " + i1/i2);
	}

}
