package testing;


class whatsapp1
{
	void status()
	{
		System.out.println("status with text");
	}
}
class whatsapp2 extends whatsapp1
{
	void status() {
		System.out.println("status with text,photos and videos");
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		whatsapp2 w = new whatsapp2();
		w.status();
	}

}
