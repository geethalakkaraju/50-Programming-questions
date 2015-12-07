package progquestions;


import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReplaceString {
		
		public static void main(String[] args) throws Exception{
			
			FileReader fr = new FileReader ("C:/Users/Geetha/testfile.txt");
			FileWriter fw = new FileWriter ("C:/Users/Geetha/testfile.txt");
			
			Scanner scan = new Scanner (new FileInputStream ("C:/Users/Geetha/testfile.txt"));
			String s = "snow";
			String str = "";
			
			
			while (scan.hasNext())
			{
				str = scan.next();
				if (str.equals(s))
				   str = str.replace("snow", "milk");
				fw.write(str);
				
			}
			
			fw.close();
			
			System.out.println("Replaced ");
		}
}
