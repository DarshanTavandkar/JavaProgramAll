
package javaprogram;

public class Program27 {

	//Armsrong number
	
	public static void main(String args[]) 
	{
		int num=153;
		int org=num;
		int sum=0;
		int i;
		
		while(num>0)
		{
		i=num%10;
		num=num/10;
		sum=sum+i*i*i;
		}
		if(org==sum) 
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
		
			
	}	
	
}
