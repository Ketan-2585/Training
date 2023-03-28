//7. Write a  program to find words which are greater than given length k?

package testing;

public class WorldLength {

	public static void main(String[] args) {
		String[] s = {"Apple", "bananana", "kiwi", "berry", "almond"};
		int k=5;
		
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>5)
			{
				System.out.println(s[i]);
			}
		
		}
	}

}
