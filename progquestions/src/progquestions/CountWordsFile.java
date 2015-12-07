package progquestions;

import java.util.*;
import java.io.*;

public class CountWordsFile {
	
	public static void main(String[] args) throws Exception{
		
		
		File file = new File ("C:/Users/Geetha/testfile.txt");
		Scanner scan = new Scanner (new FileInputStream (file));
		int count = 0;
		
		while (scan.hasNext())
		{
			scan.next();
			count++;
			
		}
		
		System.out.println("Number of words in the file " + count);
		
		
	}

}
