package abstraction;

public class Draw extends Shape{

	@Override
	public void rectangle() {
		
	System.out.println("Shape is rectangle");
		
	}

	@Override
	public void cricle() {
	
		System.out.println("Shape is cricle");
		
	} 
	
	public static void main(String args [])
	{
		Draw d=new Draw();
		d.rectangle();
		d.cricle();
		d.square();
	}
	

}
