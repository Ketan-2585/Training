//4.Write a program which returns square of given input.

package testing;

public class startsWith{

	public static void main(String[] args) {
		String[][] s= {{"hi","good","morning"},{"how","are","you"},{"We","are","here","to","celibrate","holi"},{"plz","come","home"}};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				if(s[i][j].startsWith("h"))
				{
					System.out.println(s[i][j]);
				}
			}
		}
	}

}
