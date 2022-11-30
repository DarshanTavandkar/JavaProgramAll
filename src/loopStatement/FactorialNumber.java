package loopStatement;

public class FactorialNumber {
	
	public static void main(String args[])
	{
		int num=5;
		int factorial = 1;
		
		for(int i=1;i<=10;i++)
		{
			factorial *= i;
			
		}
		
		System.out.println(factorial);	
		
	}
}
