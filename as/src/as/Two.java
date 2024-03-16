package as;

public class Two {
	static int num = 1;
	static String name = "name";
	
	int no = 1;
	String naam = "naam";
	public static void main(String[] args) {
		Two two = new Two();
		
		System.out.println(Two.name);
		System.out.println(Two.num);
		System.out.println(two.naam);
		System.out.println(two.no);
	}
}
