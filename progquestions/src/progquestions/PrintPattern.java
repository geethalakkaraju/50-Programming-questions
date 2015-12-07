package progquestions;

public class PrintPattern {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 7; i++) {
			
			int count = i;
			while (count > 0)
			{
				System.out.print("*");
				count --;
			}
			
			System.out.println("");
		}
                      
		
	}

}
