package as;

abstract class Ab{
abstract void method();
}
public class Five extends Ab {
	public static void main(String[] args) {
		
		Five five = new Five();
		five.method();
	}

	@Override
	void method() {
		System.out.println("abstract");
		
	}
}
