//3. Write an example(code) of calling a function using class object.

package testing;

class calling
{
	void call()
	{
		System.out.println("method is called");
	}
}
public class ClassObject {

	public static void main(String[] args) {
		
		calling s = new calling();
		s.call();
		

	}

}
