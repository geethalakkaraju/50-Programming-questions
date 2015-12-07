package progquestions;

import java.io.*;

public class DataInputStreamEx {
	
	public static void main(String[] args) throws IOException{
		
		DataInputStream dis = new DataInputStream(System.in);
		
		System.out.println("Enter the integer");
		
		int i1 = Integer.parseInt(dis.readLine());
		
		System.out.println("Enter the integer2");
		
		int i2 = Integer.parseInt(dis.readLine());
		
		System.out.println("The product of the numbers " + (i1 * i2));
		
		
	}

}
