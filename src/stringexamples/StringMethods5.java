package stringexamples;

public class StringMethods5 {

	public static void main(String[] args) {
		
		String history="Seek & kindness & practice & kindness & and & elicit & more & trust & depth & and & love  in  life";

		 String[] s1 = history.split("&");
		
		
		for(String obj:s1)
		{
			System.out.print(obj);
		}
		
		
	}

}
