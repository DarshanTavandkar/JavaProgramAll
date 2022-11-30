package javaprogram;

public class Program13 {
	
	// Find GCD of two Numbers
	
	public static void main(String[] args) {
		
		int num1=40, num2=16;  
		while(num1!=num2)   
		{  
		if(num1>num2)  
		num1=num1-num2;  
		else  
		num2=num2-num1;  
		}  
		System.out.printf("GCD of num1 and num2 is: " +num2);
		
	}

}
