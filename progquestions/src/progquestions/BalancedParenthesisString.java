package progquestions;

import java.util.*;

public class BalancedParenthesisString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Stack<Integer> stk = new Stack <Integer>();
		System.out.println("Enter the expression: ");
		String exp = scan.next();
		int len = exp.length();
		
		for (int i = 0; i < len; i++)
		{
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);
			else if (ch == ')')
			{
				try
				{
					int p = stk.pop() + 1;
					System.out.println("')' at index "+(i+1)+" matched with ')' at index" +p);
				}
				
				catch (Exception e)
				{
					System.out.println("unmatched");
				}
			}
		}
	}
}
