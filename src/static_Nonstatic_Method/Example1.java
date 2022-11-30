package static_Nonstatic_Method;

public class Example1 {
	
	//Main Method
	public static void main(String args[]) 
	
	{
		Example1.Miraroad();
		
		Example1 X = new Example1();
		X.Dadar();
			
	}

	//Static Methods
	
		public static void Miraroad()
		{
			System.out.println("Mira road");
		}
	
    //Non-Static Methods
		
		public void Dadar()
		{
			System.out.println("Dadar");
		}
				
				
}
