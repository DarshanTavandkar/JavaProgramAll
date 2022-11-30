package operatorExamples;

public class BitwiseOpEx {
	
	public static void main(String args[])
	{
		//AND bitwise operator
		
		System.out.println((100>50)&&(20>30));// t && f = F
		System.out.println((50>25)&&(60>70)&&(80>100)&&(50>30));// t && f && f && t = F
		System.out.println((120>90)&&(50>40)&&(100>70));// t && t && t = T
		System.out.println((50>30)&&(60>50)&&(100>120));// t && t && f = F
		
		
		//OR bitwise operator
		
		System.out.println((100>40)||(50>60));// t || f = T
		System.out.println((50>60)||(60>80)||(80>100));// f || f || f = F
		System.out.println((70>100)||(80>90)||(30>20));// f || f || t = T
		System.out.println((100>120)||(120>130)||(300>200));// f || f || t = T
		
		//XOR bitwise operator
		
		System.out.println((100>50)^(80>40)); // t ^ t  = F
		System.out.println((50>25)^(60>80));  // t ^ F  = T
		System.out.println((100>120)^(130>100)^(150>180)^(200>400)); // f ^ t ^ f ^ f = T
		System.out.println((200>300)^(400>200)^(300>400)); // f ^ t ^ f = T
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
