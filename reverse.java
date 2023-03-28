//7. Write a program to reverse an string using for and while loop.

package testing;

public class reverse{

	public static void main(String[] args) {
		String s = "java";
		String c=" ";
		char out;
		
		for(int i=0;i<s.length();i++)
		{
			out=s.charAt(i);
			c=out+c;
		}
		System.out.println(c);
	}
}

