package class3;

public class Institude1
{
   private  int a=20;
	
	private Institude1()
	{
		System.out.println("Construtor institude1");
	}
	
	private void demo() 
	{
		System.out.println("Method demo");
	}
	
	
	public static void main(String args[])
	{
		Institude1 x =new Institude1();
		System.out.println(x.a);
		x.demo();
	}
	
	
	
	
		
	
}
