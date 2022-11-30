package inheritance;

public class XYZ implements Z {

	@Override
	public void demo1() {
		System.out.println("mumbai");
	}

	@Override
	public void demo2() {
		System.out.println("Pune");
		
	}

	@Override
	public void demo3() {
	
		System.out.println("Nashik");
	}

	public static void main(String args [])
	{
		XYZ x=new XYZ();
		x.demo1();
		x.demo2();
		x.demo3();
		
	}
	
	
	
}
