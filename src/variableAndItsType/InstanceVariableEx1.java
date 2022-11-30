package variableAndItsType;

public class InstanceVariableEx1 {
	
	int a=30;
	int b=40;
	
	
		public void mul() 
		
	{
		int result = a*b;
		
		System.out.println(result);
			
		
	}
	
		public static void div() {
			
		}
		
		
		public static void main(String args[]) 
		
		{
			InstanceVariableEx1 f= new InstanceVariableEx1();
			
			f.mul();
			
			int x= f.a+f.b;
			
			System.out.println(x);
		}
	
		
}
