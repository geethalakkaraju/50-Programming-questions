package progquestions;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 500;
		
		for (int i = 2; i < n/2; i++) {
			if (n%i == 0) {
				System.out.println(n + " is not prime");
				break;
				
			}
			
			else
			{
				System.out.println(n + " is prime");
				break;
			}
						
		}
		
				
	}

}
