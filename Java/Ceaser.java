import java.util.*;
public class Ceaser {
	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String ciphertext = sc.nextLine();	//input cipher text
	        int key = 13;						//taking key=13
	        String Text = new String();
	        for(int i=0; i < ciphertext.length();i++)  
	        {
	            char alphabet = ciphertext.charAt(i);
	            if(alphabet >= 'a' && alphabet <= 'z')
	            {
	                alphabet = (char) (alphabet - key);
	                if(alphabet < 'a') {
	                    alphabet = (char) (alphabet-'a'+'z'+1);	//Setting alphabet value
	                }
	                Text = Text + alphabet;
	            }    
	                //For capitals
	            else if(alphabet >= 'A' && alphabet <= 'Z')
	            {
	                alphabet = (char) (alphabet - key);
	                
	                if (alphabet < 'A') {
	                    alphabet = (char) (alphabet-'A'+'Z'+1);
	                }
	                Text = Text + alphabet;            
	            }
	            else 
	            {
	             Text = Text + alphabet;            
	            } 
	        }
	        System.out.println(Text);
	    }
}
