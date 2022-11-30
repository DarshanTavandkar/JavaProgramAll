package decisionMakingStatements;

public class IfElseLedder {

	public static void main (String main[])
	{
		
		int age=70;
		
		if (age<=18)
		{
			System.out.println("not Eligibal for personal loan ");
		}
		
		else if((18<age)&&(age<=25))
		 {
			 System.out.println("Eligibal for Education loan");
		 }
		else if ((25<age)&&(age<=35))
		{
			System.out.println("Eligibal for personal loan upto 500000/-");
		}
		else if ((35<age)&&(age<=45))
		{
			System.out.println("Eligibal for personal loan upto 300000/-");
		}
		else if ((45<age)&&(age<=55))	
		{
			System.out.println("Eligibal for personal loan upto 150000/-");
		}
		else 
		{
			System.out.println("Not Eigibal for any loan");
		}
					
	}
		
}
