package variableAndItsType;

public class LocalVariableEx1 {
	
	public static void main(String args[])
	
	{
		LocalVariableEx1 e= new LocalVariableEx1 ();
		
		e.add();
		e.sub();
		
	}
	
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		
		System.out.println(c);
	}
	
	public void sub()
	{
		int a=50;
		int b=30;
		int d=a-b;
		
		System.out.println(d);
	}
	
	

}
