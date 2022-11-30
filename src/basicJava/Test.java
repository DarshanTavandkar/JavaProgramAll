package basicJava;

public class Test {
	
	//declaration
	
	int a;
	int b;
	
	public void add() {
		
		//initilization
		
		a=50;
		b=30;
		//usage	
		int c=a+b;
		
		System.out.println(c);
		
		
	}
	
	public static void main(String args[])
	{
		Test x=new Test();
		x.add();
	}


}
