package progquestions;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n = 5;
		int fact = n;		
		
		if (n < 0) {
			System.out.println("Number should be positive!");
		}
		
		else {
		
		for (int i = n; i > 1; i--) {
			
			fact = fact * (n-1);
			n--;
			
		}			
		}
		
		System.out.println(fact);
		
	}

}
