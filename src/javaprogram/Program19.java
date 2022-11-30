package javaprogram;

public class Program19 {
	// Count Number of Digits in an Integer
	
	public static void main(String[] args) 
	{
	
		int count=0,num=1234;
		while(num!=0)
		{
			num/=10;
			++count;
		}
		System.out.println("Number of Digits = "+count);
		
		

	}

}
