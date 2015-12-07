package progquestions;

public class LargestNumberArray {
	
	public static void main(String[] args) {
		
		int [] a = {4,2,9,6,3,1};
		
		int largest = a[0];
		int length = a.length;
		
		for (int i = 0; i < length - 1; i++) {
			if (a[i] > largest)
				largest = a[i];
		}
	    System.out.println("Largest is " + largest);	
	}

}
