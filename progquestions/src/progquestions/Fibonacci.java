package progquestions;

public class Fibonacci {
	
	public static void main (String []args)
	{
		int prev = 1;
		int next = 1;
		int n = 10;
		int count = 0;
		int sum = 0;
		
		System.out.print(prev + ", " + next + ", ");
		
		while (count < n) {
			
			sum = prev + next;
			System.out.print(sum + ", ");
			prev = next;
			next = sum;
			count ++;
		}
	}
	
}
