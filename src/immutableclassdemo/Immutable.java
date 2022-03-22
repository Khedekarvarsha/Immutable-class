package immutableclassdemo;

public class Immutable {

	public static void main(String[] args) {
		
		Address  add = new Address("India", "Kolhapur", 416220);
		
		Student std = new Student(1, "ABC", add);
		
		System.out.println("Original data of student : ");
		
		System.out.println(std);
		
		add.setCity("Pune");
		
		Student std1= new Student(2, "PQR", add);
		System.out.println(std1);
		
		System.out.println("After changing the data city : ");
		
		System.out.println(std);
		
		System.out.println(add);
		
		
		String s1= new String("abc");
		String s2 = s1.concat("abc");
		String s3 = "abcabc";
		String s4=s2.intern();
		System.out.println(s2=s4);
		
		
	}
}
