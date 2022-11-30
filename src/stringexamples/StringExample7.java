package stringexamples;

public class StringExample7 {

	 public static void main(String[] args) {

		    String name ="This is closed";

		    char[] x1 = name.toCharArray();
		    boolean foundSpace = true;

		    for(int i = 0; i < x1.length; i++) {

		      // if the array element is a letter
		      if(Character.isLetter(x1[i])) {

		        // check space is present before the letter
		        if(foundSpace) 
		        {

		          // change the letter into uppercase
		          x1[i] = Character.toUpperCase(x1[i]);
		          foundSpace = false;
		        }
		      }

		      else {
		        // if the new character is not character
		        foundSpace = true;
		      }
		    }
		    

		    // convert the char array to the string
		    String word = String.valueOf("This is closed");
		    System.out.println("Message: " + word);
		  }
		}
	
	
	

