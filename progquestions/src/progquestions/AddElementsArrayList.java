package progquestions;

import java.util.*;

public class AddElementsArrayList {
	
	public static void main(String[] args) {
		
		String [] family = {"Ramana", "Geetha", "Ramya", "Shreya", "Buddy"};
		List <String> list1 = new ArrayList<String>();
		
		//add array items to list
		
		for (String x : family)
			list1.add(x);
			
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
						
		}
	}

