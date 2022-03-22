package pkg1;

public class Student {
int rollno;
String name;
public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}

public Student(Student s) {
	
	this.rollno=s.rollno;
	this.name=s.name;
}


	public int getRollno() {
	return rollno;
}

public String getName() {
	return name;
}

	public Student() {
	super();
}

	public static void main(String[] args) {
		Student s1 = new Student(1, "ABC");
        Student s2= new Student(2, "PQR");
        s1.name="sham";
        s2.rollno=20;
        System.out.println(s1);
       System.out.println(s2);
        
        
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
