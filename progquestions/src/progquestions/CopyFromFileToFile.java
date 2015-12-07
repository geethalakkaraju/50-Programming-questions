package progquestions;

import java.io.*;


public class CopyFromFileToFile {
	
	public static void main(String[] args){
		
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		byte byteRead;
		try {
			inFile = new FileInputStream ("C:/Users/Geetha/testfile.txt");
			outFile = new FileOutputStream ("C:/Users/Geetha/testfile1.txt");
			
			//Reading bytes from testfile.txt and writing to testfile1.txt
			
			do
			{
				byteRead = (byte) inFile.read();
				outFile.write(byteRead);
			} while (byteRead != -1);

		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("File not Found!");
		}
		
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
			inFile.close();
			outFile.close();
			}
			catch (IOException e) {
				
			}
		}
		
		
	}

}
