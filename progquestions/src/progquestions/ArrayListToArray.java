package progquestions;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList <String> arrlist = new ArrayList <String> ();
		arrlist.add("Ramana");
		arrlist.add("Geetha");
		arrlist.add("Ramya");
		arrlist.add("Shreya");
		arrlist.add("Buddy");
		
		String [] array = new String [arrlist.size()];
		
		for (int i = 0; i < arrlist.size(); i++) {
			array [i] = arrlist.get(i);
		}
		
		//Display array element
		
		for (String a : array) {
			System.out.print (a + " ");
		}

	}

}
