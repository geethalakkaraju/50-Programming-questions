package progquestions;


public class Printa1a2a3b1b2b3Asa1b1a2b2 {
	
	public static void main(String[] args) {
		
		String [] a = {"a1", "a2", "a3", "a4"};
		String [] b = {"b1", "b2", "b3", "b4"};
		
		int la = a.length;
		int lb = b.length;
		int i = 0;
		
		while ((i < la) && (i < lb)) {
			System.out.print(a[i] + "," + b[i] + ",");
			i++;
		}

		
	}

}
