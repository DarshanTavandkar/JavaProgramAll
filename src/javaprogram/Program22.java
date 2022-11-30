package javaprogram;

public class Program22 {
	
	
	//Display Factors of a Number
	
	public static void main(String[] args) 
	{
		int num=20;
		System.out.print("Factors of "+ num + " are: ");
		for(int i=1;i<=10;++i)
		{
			if(num%i==0)
			{
				System.out.print(i +"  ");
			}
		
			
		}
		
		
	
	}

}
