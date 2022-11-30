package decisionMakingStatements;

public class FIndGreaterNumberEx1 {
	
	public static void main (String args[]) {
	
	int a=100;
	int b=80;
	int c=60;
	int d=40;
	
	if(a>b)
	{
		if(a>c) 
		{
			if(a>d)
			{
				System.out.println("Largest among four number is  a ");
			}
			
			else 
			{
				System.out.println("Largest among four number is d");
			}	
		}
	}
	
	else if (b>c)
	{
		if(b>d) 
		{
			System.out.println("Largest among four number is   b");
		}
		else 
		{
			System.out.println("Largest among four number is  d");
		}
			
	}
	else if (c>d) 
	{
		System.out.println("Largest among four number is c");
	}
	else 
	{
	   System.out.println("Largest among four number is d");	
	}
	
	}
}
