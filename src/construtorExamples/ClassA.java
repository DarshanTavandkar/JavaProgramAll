package construtorExamples;

public class ClassA 
{
	
	String City;
	
	ClassA()
	{
		City= "Mumabi";
	}
	
	public void address()
	
	{
		System.out.println(City);
	}
	
	public static void main(String args[])
	{
		ClassA z=new ClassA();
		z.address();
	}	
	

}
