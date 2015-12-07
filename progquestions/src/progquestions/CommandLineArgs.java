package progquestions;

// This program accepts input from the command line and then prints it

public class CommandLineArgs {
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}

}
