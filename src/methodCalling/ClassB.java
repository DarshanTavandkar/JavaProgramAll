package methodCalling;

public class ClassB {
	
	public void add(int a) 
	
	{
		System.out.println(a);
	}
	
	public static void main (String args []) 
	
	{
	  ClassB g=new ClassB();
	  g.add(50);
	  g.add(200);
		
	}
	

}
