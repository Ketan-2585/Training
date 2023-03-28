//2. Write an example(code) to inherit one class property from another class.

package testing;

class demo
{
	int x=10;
	
}
class sample extends demo
{
	void call()
	{
		System.out.println("calling method");
	}
}

public class Inherit {

	public static void main(String[] args) {
		demo s=new sample();
		System.out.println(s.x);
	
	}

}
