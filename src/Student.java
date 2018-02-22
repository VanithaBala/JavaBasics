
public class Student {
	int regNo;
	String name;

	Student(int regNo, String name, Address add) {
		this.regNo = regNo;
		this.name = name;
		this.adr = add;
	}

	Address adr;

	public static void main(String args[]) {
		// Address adr
		Address ad = new Address("North", "Chennai");
		Student s1 = new Student(11, "Vanit", ad);
		System.out.println(s1.regNo + " " + s1.name);
		System.out.println(s1.adr.street + " " + s1.adr.city);
	}
}
