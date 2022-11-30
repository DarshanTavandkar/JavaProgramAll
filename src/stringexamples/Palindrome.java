package stringexamples;

public class Palindrome {

	public static void main(String[] args) {
		
		String a="madam";
		
		int l = a.length();
		
		String reverse="";
		
		for(int i=l-1;i>=0;i--)
		
		{
			reverse=reverse+ a.charAt(i);
			
		}
		
		if (a.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
			
	}

}
