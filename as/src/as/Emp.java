package as;

public class Emp {

	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	String Name = "name";
	int id = 1;
	double sal = 100;
	String address = "address"; 

	public static void main(String[] args) {
		Emp emp = new Emp(); 
		
		System.out.println(emp.address);
		System.out.println(emp.id);
		System.out.println(	emp.Name);
		System.out.println(emp.sal);
	
	}

}

