package stringexamples;

public class StringMethod1 {

	public static void main(String[] args) {
		
		String a="I love India";
        String b="I love india";
		
	    boolean result1 = a.equals(b);
		
		System.out.println(result1);
		
		boolean result2 = a.equalsIgnoreCase(b);
		System.out.println(result2);
		
		
		int p1 = a.length();
		System.out.println(p1);
		
		
		
	}

	
	
}
