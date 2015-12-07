package progquestions;

public class SortArray {
	
	public static void main(String[] args) {
		int [] a = {55, 7, 9, 5, 4, 9, 66, 8};
		int length = a.length;
		int temp;
		
		for (int i = 0; i < length-1; i++)
		{
			for (int j = i; j < length-1; j++)
			{
			if (a[i] > a[j]) {
				temp = a[i];
			    a[i]= a[j];
				a[j] = temp;
			 }
			}
			
			System.out.println(a[i]);
				
		}
	}

}
