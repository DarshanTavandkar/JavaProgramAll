package practice;

public class Sample1 {

	public int Demo() 
	{
	   int a=50;
	   int b=60;
	   int c= a+b;
	   
	   return c;
	}
	
	public static void main (String args[])
	{
		Sample1 s= new Sample1();
		int x = s.Demo();
		
		System.out.println(x);	
		
	}
		
	
}
