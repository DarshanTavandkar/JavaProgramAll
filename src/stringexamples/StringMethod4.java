package stringexamples;

public class StringMethod4 {

	public static void main(String[] args) {
		
		String name= "sachin";
		
		char[] n1 = name.toCharArray();
		
		System.out.println(n1);

		int l1 = name.length();
		System.out.println(l1);		
				
		for(int i=0;i<l1;i++) 
		{
			char l2 = name.charAt(i);
			System.out.println(l2);
			
		}
		
	}

}
