package progquestions;

import java.util.*;

public class SearchElementArrayList {
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList <String> ();
		list.add("Ramana");
		list.add("Geetha");
		list.add("Ramya");
		list.add("Shreya");
		list.add("Buddy");
		
		for (String x : list)
		{
			if (x == "Buddy")
				System.out.println("Found " + x);
		}
		
		
		}
	}


