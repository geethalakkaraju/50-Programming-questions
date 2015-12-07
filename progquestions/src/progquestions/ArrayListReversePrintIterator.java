package progquestions;

import java.util.*;

public class ArrayListReversePrintIterator {

		public static void main(String[] args) {
			
			List <String> list = new ArrayList <String> ();
			list.add("Ramana");
			list.add("Geetha");
			list.add("Ramya");
			list.add("Shreya");
			list.add("Buddy");
			
			ListIterator li = list.listIterator(list.size());
			while (li.hasPrevious())
			{
				System.out.println(li.previous());
			}
		
	}

}
