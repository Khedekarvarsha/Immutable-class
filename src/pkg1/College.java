package pkg1;

public final class College {

	private final int clg_id;
	private final String clg_Name;
	private final Student s;

	public College(int clg_id, String clg_Name, Student s) {
		super();
		this.clg_id = clg_id;
		this.clg_Name = clg_Name;
		this.s=s;
//		
//		Student copy = new Student();
//		copy.rollno=s.rollno;
//		copy.name=s.name;
//		//this.s=copy;	

	}
	

	public static void main(String[] args) {
		Student s= new Student(11, "ABC");
		System.out.println(s);

		College c1= new College(1, "COEP", s );
		College c2= new College(2, "AISSMS", s);
		System.out.println(c1);
		System.out.println(c2);
//		c2.s.name="RCS";
//		System.out.println(c2);
//		c1.s.rollno=20;
//		System.out.println(c1);
//		
		
		
	}



	@Override
	public String toString() {
		return "College [clg_id=" + clg_id + ", clg_Name=" + clg_Name + ", s=" + s + "]";
	}
	
	
}
		
	

