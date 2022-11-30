package decisionMakingStatements;

public class IfElseStatement2 {
	
	public static void main(String args [])
	
	{
		// Check weather it is leap year or not
	 int year = 2000;
	 
	 if (year % 4 ==0) 
	 {
		 if((year % 100!=0)||(year % 400==0)) 
		 {
			 System.out.println(year + " is leap year ");
		 }
		 else 
		 {
			 System.out.println(year+" is not leap year"); 
		 }
	 }
	 else
	 {
		 System.out.println(year+" is not leap year");
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}