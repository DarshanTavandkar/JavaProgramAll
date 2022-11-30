package class6;

public class Watch1 {

  protected int a = 50;
	
	protected Watch1()
	{
		System.out.println("Constructor Watch1");
	}
	
	 protected void Digital()
	{
		System.out.println("My watch is Digital");
	}
	

	public static void main (String args[])
	{
		Watch1 obj = new Watch1();
		System.out.println(obj.a);
		obj.Digital();
	}
	
}
