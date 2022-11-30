package inheritance;

public class Bird extends Animal{

	public void parrot()
	{
		System.out.println("parrot is bird");
	}
	
	public void crow()
	{
		System.out.println("Crow is bird");
	}
	
	public static void main(String args[])
	{
		Bird b =new Bird();
		b.Lion();
		b.Tiger();
		b.parrot();
		b.crow();
		
	}
	
		
	
}
