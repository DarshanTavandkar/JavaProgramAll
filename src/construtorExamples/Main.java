package construtorExamples;

public class Main {

	//declartion
	
	int a;
	int b;
	int c;
	
	Main()
	{
		//Initilization
		
	a=25;
	b=30;
	c=50;
	
	}	
	public void add()
	
	{
		//Usage
		
		System.out.println(a+b+c);	
	}
	//Main Method
	public static void main (String args[])
	{
		
	 Main m=new Main();	
	 m.add();	
		
	}
}
