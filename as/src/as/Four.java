package as;

class A{
	void method(){
		System.out.println("noraml method");
	}
}
public class Four extends A{
	void method(){
		System.out.println("overriding");
		
	}
	public static void main(String[] args) {
		Four four = new Four();
		
		four.method();
	}
}
