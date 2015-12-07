package immutableClassEx;

public  final class Immutable {
	
			
		private final String name;
		private final String phNum;
		
		public Immutable (String name, String phNum)
		{
			this.name = name;
			this.phNum = phNum;
		}
		
		public String getName () {
			return name;
		}
		
		public String getphNum () {
			return phNum;
		}


	}


