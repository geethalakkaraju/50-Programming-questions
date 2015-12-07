package progquestions;

import java.util.*;

public class HashMapSearchKeyReturnValue {
	
	public static void main(String[] args) {
		
		HashMap <String, Integer> directory = new HashMap <String, Integer> ();
		directory.put("Ramana", 123456);
		directory.put("Madhavi", 789101);
		directory.put("Ramya", 234567);
		directory.put("Shreya", 891011);
		
		System.out.printf("%s ", directory);
		System.out.println(directory.get("Madhavi"));
		
		
	}

}
