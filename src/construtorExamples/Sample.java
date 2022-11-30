package construtorExamples;

public class Sample {
	
	//declaration
	
	int a;
	int b;
	
	//Initilazation
	Sample()
	{
		a=80;
		b=40;
				
	}
	
	//Usage
	public  void mul()
	
	{
		System.out.println(a*b);
		
	}
	
	//Main Method
	
	public static void main (String args[]) 
	{
		Sample z=new Sample();
		z.mul();
		
	}	

}
