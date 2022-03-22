package pkg2;

public class Std {

	int rollno;
	String name;
	public Std(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		Std s1= new Std(1, "Ram");
		Std s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
	}


	@Override
	public String toString() {
		return "Std [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
