package progquestions;

public class ReverseEveryWordString {
	
	public static void main(String[] args) {
		
		String s = "hello world";
	    StringBuffer buffer = new StringBuffer();
	    
	    String[] str = s.split(" ");
	    
	    

	        for(int i = str.length - 1; i >= 0; i--){
	        	
	        	buffer.append(str[i]);
		        System.out.println(buffer.toString());
	        	buffer.append(" ");

	        }

	        System.out.println("Original String: " + s);
	        System.out.println("Reverse String: " + buffer.toString());
	    }
}