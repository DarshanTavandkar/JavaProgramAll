package methodCalling;

public class Sample2 {
	
	public void test2() 
	{
		
		System.out.println("Test2 is Non-static Method");
		
		
	}
	
	public static void main (String args[])
	
	{
		Sample2 h=new Sample2();
		h.test2();
		
	    Sample1 j=new Sample1();
	    j.test1();
		
	}
	

	

}
