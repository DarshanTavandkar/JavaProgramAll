package javaprogram;

public class Program9 {
	
//Leap year
	
	public static void main(String args[])
	{
		int year = 2022;
		
		if (year% 4==0)
		{	
		 if((year%100!=0 )||( year%400==0))	
		{
			System.out.println(year +"is leap year");
		}
		else
		{
			System.out.println(year + "is not leap year");
		}
		}
		else
		{
			System.out.println(year + " is not leap year");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
