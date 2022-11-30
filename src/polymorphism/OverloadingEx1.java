package polymorphism;

public class OverloadingEx1 {
 //Overloading method
	public void test(int a)
	{
		System.out.println("integer argument method");
	}
	
	public void test(boolean b)
	
	{
		System.out.println("boolean argument method");
	}
	
	public void test(double c)
	{
		System.out.println("Double argument method");
	}
	
	public void test(long d)
	{
		System.out.println("long argument method");
	}
	
	public void test(float e)
	{
		System.out.println("float argument method");
	}
	
		public static void main(String args []) 
		{
			OverloadingEx1 x=new OverloadingEx1();
			x.test(10);
			x.test(50L);
			x.test(44.44f);
			x.test(12.5);
			x.test(true);
		}
		
		
	}
	
	
	
	

