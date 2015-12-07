package progquestions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class StringCountFile {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File ("C:/Users/Geetha/testfile.txt");
		Scanner scan = new Scanner (new FileInputStream (file));
		int count = 0;
		String s = "Mary";
		String str = "";
		
		while (scan.hasNext())
		{
			str = scan.next();
			if (str.equals(s))
			    count++;
			
		}
		
		System.out.println("Number of words in the file " + count);
	}

}
