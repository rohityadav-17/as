package as;

interface In{
	void method();
}
public class Six implements In{

	@Override
	public void method() {
		System.out.println("interface");
		
	}
	public static void main(String[] args) {
		Six six = new Six();
		six.method();
	}
	

}
