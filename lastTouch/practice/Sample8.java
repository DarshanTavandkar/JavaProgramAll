package practice;

public class Sample8 {

	public double demo8()
	{
		double a =100.001d;
		double b =110.233d;
		double c= a+b;
		
		return c;
	}
	
	public static void main (String args[])
	{
		Sample8 s=new Sample8();
		Object x = s.demo8();
		
		System.out.println(x);
	}
	
	
	
	
	
		
	
}
