package javaprogram;

public class Program25 {
  // palindrome number
	
	public static void main(String args[])
	{
		int n=16461;
		int temp=n;
		int rev=0,rem;
		while(temp!=0)
		{
			
			rem =temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		
		}
		if(n==rev)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
	}

}
