package progquestions;

public class MissingNumArray {
	
	public static void main(String[] args) {
		
		int []a = {4,5,6,8,9,10};
		int length = a.length;
		
		for (int i = 0; i < length-1; i++)
		{
			if ((a[i] + 1) != (a[i+1]))
			{
				System.out.println(a[i] + 1 + " is the missing number");
			}
		}
	}

}
