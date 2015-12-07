package progquestions;

// This program uses Iterator to print the elements in an ArrayList

import java.util.*;
import java.util.List;

public class ArrayListPrintIterator {
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList <String> ();
		list.add("Ramana");
		list.add("Geetha");
		list.add("Ramya");
		list.add("Shreya");
		list.add("Buddy");
		
		Iterator it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
			
							
		}

}
