package exceptionEx;
import java.util.*;

public class NullPointerExceptionDemo {

	
	private static String nullDemoValue;
	
	public static void main(String[] args) throws NullPointerException {
		
		try {
			System.out.println(nullDemoValue.length());
			List <String> list = null;
			calculateInterest(list);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
	}
	
	private static void calculateInterest (List <String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}
}
