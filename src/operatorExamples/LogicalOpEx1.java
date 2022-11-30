package operatorExamples;

public class LogicalOpEx1 {
	
	public static void main(String args[])
	{
		//And logical operator
		
		System.out.println((20>10)&&(10>15));//T && F = F
		System.out.println((50>30)&&(30>50)&&(60>40)&&(40>30));//t && F && t && t = F
		System.out.println((100>50)&&(50>30)&&(60>50)&&(50>25));//t && t && t && t = T
		System.out.println((100>200)&&(50>25)&&(70>100));//f && t && f = F
		
		
		// OR logical operator
		
		System.out.println((100>50)||(50>60));// t || F = T
		System.out.println((70>50)||(50>80)||(60>40)||(50>90));//t||f||t||f = T
		System.out.println((50>60)||(60>70)||(80>100)||(100>120));//f||f||f||F = f
		System.out.println((100>70)||(80>40)||(50>70));//t||t||f = T
		
		//NOT logical operator
		
		System.out.println(!true);
		System.out.println(!(40>20));//t = F 
		System.out.println(!(60>80));//f = T
		System.out.println(!(100>60));//t= F
		System.out.println(!(70>80));//f = T
		
		
		
	}	

}
