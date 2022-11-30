package polymorphism;

public class Son extends Mother {
 // Overriding method
	public void Name1(String a)
	{
		System.out.println("My name is suraj");
	}
	public void Name2(String b)
	{
		System.out.println("My name is Sanket");
	}
	public void Name3(String c)
	{
		System.out.println("My name is Aniket");
	}
	public void Name4(String d)
	{
		System.out.println("My name is Mayur");
	}
	public void Name5(String e)
	{
		System.out.println("My name is Abhi");
	}
	
	public static void main(String args[])
	{
		Son z=new Son();
		z.Name1(null);
		z.Name5(null);
		
		Mother x=new Mother();
		x.Name2(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
