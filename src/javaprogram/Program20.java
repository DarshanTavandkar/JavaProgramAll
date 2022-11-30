package javaprogram;

public class Program20 {
	     // Reverse a Number
	public static void main(String[] args) 
	{
		int num= 123456;
		int reverse=0;
		while(num!=0)
		{
			int r =num%10;
			reverse=reverse*10+r;
			num=num/10;
			
		}
		System.out.println("Reverse Number= "+ reverse);
				
	}

}
