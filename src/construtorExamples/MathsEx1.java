package construtorExamples;

public class MathsEx1 {

	MathsEx1(int a,int b,int c)
	{
		System.out.println(a+b+c);
	
	}
	MathsEx1(int x,int y)
	{
		System.out.println(x*y);
	}
	
	
   public static void main(String args[]) 
   {
	  new MathsEx1(50,50,50);
	  new MathsEx1(80,40);
   }
	
	
		
}
