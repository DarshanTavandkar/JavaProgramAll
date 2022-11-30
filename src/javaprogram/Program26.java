package javaprogram;

public class Program26 {
	
	//Check Whether a Number is Prime or Not
	public static void main(String args[]) 
	{
	int n= 7; int a= 0;
	
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			a=a+1;
		}
	}
	if(a==0)
	{
		System.out.println("Number is prime");
	}
	else
	{
		System.out.println("Number is not prime");
	}
	
		
	
}
}