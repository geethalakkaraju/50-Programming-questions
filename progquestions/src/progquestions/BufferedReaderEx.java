package progquestions;

import java.io.*;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		
		try {
		
		System.out.println("Enter num1");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter num2");
		String str2 = br.readLine();
		int b = Integer.parseInt(str2);
		int c = a-b;
		System.out.println("the difference of integers is " + c);
		
		} catch (Exception e)
		
		{
			System.out.println("Error is " + e);
			e.printStackTrace();
		}
		
		
		
	}

}
