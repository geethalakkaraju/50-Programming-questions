package progquestions;

public class MergeArrays {
	
	public static void main(String[] args) {
		
	
	
	int [] a = {3,5,6,8,8};
	int [] b = {9,7,6,3,2,1};
	int i = 0;
	int j = 0;
	int k = 0;
	
	int lengthA = a.length;
	int lengthB = b.length;
	
	int [] c = new int [lengthA + lengthB];
	
	while (i < lengthA)
	{
		c[k++] = a[i++];
	}
	while (j < lengthB)
	{
		c[k++] = b[j++];
	}
	
	for (int x = 0; x < c.length; x++)
	{
		System.out.println(c[x]);
	}
	
}

}
