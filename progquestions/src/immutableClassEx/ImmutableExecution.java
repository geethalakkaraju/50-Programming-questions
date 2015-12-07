package immutableClassEx;


public class ImmutableExecution {
	
		
    public static void main(String[] args) {
			
			final String name = "Geetha";
			final String phNum = "123456";
			String n;
			String num;
			
			Immutable contacts = new Immutable (name, phNum);
			
			n = contacts.getName();
			System.out.println(n);
			
			num = contacts.getphNum();
			System.out.println(num);
			

	}

}
