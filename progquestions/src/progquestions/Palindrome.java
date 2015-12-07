package progquestions;

import java.util.*;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string : ");
		String s = scan.nextLine();
		
		int strlength = s.length();
		
		int i, begin, end, middle;
		
		begin = 0;
		end = strlength - 1;
		middle = begin + end / 2;
		
		for (i = begin; i <= middle; i++)
		{
			if (s.charAt(begin) == s.charAt(end))
			{
				begin++;
				end--;
				
			}
			else {
				break;
			}
		}
		
		if (i == middle + 1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}

}
