package progquestions;

/* This program prints "ping" if a number is divisible by 3 and "pong" if divisible by 5
 * and "ping pong" if divisible by 3 and 5
 */

public class PingPong {
	
	public static void main(String[] args) {
		
		int n = 100;
		
		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println( i + " pingpong");
			else if (i % 3 == 0)
				System.out.println( i + " ping");
			else if (i % 5 == 0)
				System.out.println( i + " pong");
		}
	}

}
