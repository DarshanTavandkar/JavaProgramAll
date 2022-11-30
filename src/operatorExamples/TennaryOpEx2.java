package operatorExamples;

public class TennaryOpEx2 {

	public static void main (String args[])
	{
		//reverse a number
		int num= 123456;
		int reverse=0;
		while(num!=0)
		{
		int r =num%10;
		reverse=reverse*10+r;
		num=num/10;
		}
		System.out.println("reverse number="+reverse);
	}

	
}
