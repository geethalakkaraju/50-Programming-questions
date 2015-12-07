package progquestions;

public class EnumMonths {
	
	public enum months
	{
		Jan, Feb, March, Apr, May, June, July, Aug, Sep, Oct, Nov, Dec
	}
	
	public static void main(String[] args) {
		
		for (months m : months.values()) {
			System.out.print
			(m + " ");
		}
	}

}
