package stringexamples;

public class CapitalEach {

	public static void main(String[] args) {
		
		String text= "i love india";
		
		String[] word = text.split(" ");
		 
		    int l = word .length;
	
  for(int i=0;i<l;i++)
		    
  {
	  String first=word[i].substring(0,1).toUpperCase();
	  
	  String rs=word[i].substring(1,word[i].length());
	  
	  String fs= first+rs+" ";
	  
	  System.out.println(fs);
	  
	  
  }	    
		    
		    
	}

}
