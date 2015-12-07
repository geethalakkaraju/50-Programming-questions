package progquestions;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		int []a = {5,6,2,55,64,24,5};
		
		int element = 24; 
	    int alength = a.length;
		
		for (int i = 0; i < alength-1; i++)
		{
			if (a[i] == element) {
				System.out.println("Found" + element);
				break;
			}
			else 
				System.out.println(a[i] + " Element not found");
			
		}
		
		
		
		
	}
}
