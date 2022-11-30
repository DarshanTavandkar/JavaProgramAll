package methodCalling;

public class ClassA {
	
	//static method
	
	public static void test1()
	{
		System.out.println("Static method without argument");
		
	}
	
	//Non-static Method
	
	public  void test2()
	{
		
		System.out.println("Non-Static Method without argument");
		
	}
	
	//Main Method 
	
	
		public static void main(String args[]) 
		{
			ClassA.test1();
			
			ClassA f=new ClassA();
			f.test2();
			
		}	
	

}
