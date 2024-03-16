package as;

public class Emp {

	
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	public Emp(String name, int id, double sal, String address) {
		super();
		Name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	
	String Name;
	int id;
	double sal;
	String address; 

	public static void main(String[] args) {
		Emp emp = new Emp("name", 1, 100, "name");
		Emp emp2 = new Emp("name", 1, 100, "name");
		
		
		
		System.out.println(emp.address);
		System.out.println(emp.id);
		System.out.println(emp.Name);
		System.out.println(emp.sal);
		
		emp2.toString();
		
	
	}

}

