package javaprogram;

public class Program7 {

	// Find the Largest Among Three Numbers
	
	public static void main(String[] args) 
	{
       	int a = 180;
       	int b = 260;
       	int c = 140;
		
		if (a>b)
		{
			if(b>c)
			
				{
					System.out.println("Largest among three number is a");
				}
				else
				{
					System.out.println("Largest among three number is c");
				}
		}
			else if (b>c)
			{
				if(b>a) 
				{
					System.out.println("Largest among three number is b");
				}
				else
				{
					System.out.println("Largest among three number is c");
				}
			}
				else if(c>a)	
				{
					if(c>b)
					{
						System.out.println("Largest among three number is c");
					}
					else
					{
						System.out.println("Largest among three number is c");
					}
				}
					
				
			}
				
				
				
				
			
		}

	


