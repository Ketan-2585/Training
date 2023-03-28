//8.Write a  program for removing i-th character from a string?

package testing;

public class RemoveChar {

	public static void main(String[] args) {
             
		String s= "I am tester";
		System.out.println("Before removing character string is "+ s);
		
		 StringBuilder sb = new StringBuilder(s);
		 
		 StringBuilder t = sb.deleteCharAt(0);
		 
		 System.out.println("After removing character string is"+ t);
	}

}
