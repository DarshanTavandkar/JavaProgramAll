package operatorExamples;

public class TennaryOperator {

	public static void main(String args[])
	{
		int a=50;
		int b=60;
		int c=80;
		
		int out =(a>b)?(a>c ? a:c):(b>c ? b:c);
		
		System.out.println("Largest number among three is " + out);
		
		
		
		
	}
	

	
	
	
}
