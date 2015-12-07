package progquestions;

import java.util.*;

public class ArrayRemoveDupUsingSet {
	
	public static void main(String[] args) {
		
		String [] family = {"Ramana", "Madhavi", "Ramya", "Shreya", "Buddy", "Madhavi"};
		List <String> list = Arrays.asList(family);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		// To remove duplicates we use set
		Set <String> set = new HashSet <String> (list);
		System.out.printf("%s ", set);
		
	}

}
