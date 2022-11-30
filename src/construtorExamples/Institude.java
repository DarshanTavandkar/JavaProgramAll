package construtorExamples;

public class Institude {

	Institude()
	{
		System.out.println("Construtor with Zero argument");
	}
	
	Institude(String a)
	{
		System.out.println("Construtor with String argument");
	}
	
	
	Institude(int b)
	
	{
		System.out.println("Construtor with int argument");
	}
	
	public static void main(String args [])
	{
		new Institude();
		new Institude("abcdef");
		new Institude(40);
	}
	
	
	
}
