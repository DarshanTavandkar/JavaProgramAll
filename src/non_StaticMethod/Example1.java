package non_StaticMethod;

public class Example1 {

	//Main Methods
	
	public static void main(String args[])
	{
		Example1 a= new Example1();
		a.mumbai();
		a.thane();
			
	}
	
	//Non-Static Methods
	
	public void mumbai() 
	
	{
      
		System.out.println("I am from mumbai");
	}
	
	public void thane()
	
	{
		
		System.out.println("I am from thane");
		
	}
		
}
