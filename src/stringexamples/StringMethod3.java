package stringexamples;

public class StringMethod3 {

	public static void main(String[] args) {
		
		String country= "India is my country";

		
			char c1 = country.charAt(9);
				
		System.out.println(c1);	
			
		
		int x1 = country.length();		
		
		
		System.out.println(x1);
		
		for(int i=0;i<x1;i++)
		{
		   char l1 = country.charAt(i);	
		   
		   System.out.println(l1);
		}
		
				
				
	}

}
