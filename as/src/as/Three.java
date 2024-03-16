package as;

public class Three {
	
	public void method(){
		System.out.println("method");
	}
	public void method(String a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Three three = new Three();
		
		three.method();
		three.method("overloading");
	}
}