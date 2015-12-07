package progquestions;

public class CommonNumberInArrays {
	
	public static void main(String[] args) {
		
		int []a = {5,6,9,12,45,87,94};
		int []b = {68,24,12,36,86,100};
		
		int alength = a.length;
		int blength = b.length;
		
		for (int i = 0; i < alength-1; i++)
		{
			for (int j = 0; j < blength-1; j++)
			{
				if (b[j] == a[i])
						System.out.println(b[j] + " is the common number");
			}
		}
	}

}
