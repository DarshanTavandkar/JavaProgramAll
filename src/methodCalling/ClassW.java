package methodCalling;

public class ClassW {
 //non-static method
	public void sub(int n)
	
	{
		System.out.println(n);
	}
	//Static method
	public static void div(int b)
	
	{
		System.out.println(b/5);
			
	}
	
	//Main Method
	public static void main (String args[])
	{
		ClassW x=new ClassW();
		x.sub(40);
		
		ClassQ z=new ClassQ();
		z.add(50);
	
		ClassW.div(25);
		ClassQ.mul(60);	
		
		
	}
		
}
