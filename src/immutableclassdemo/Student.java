package immutableclassdemo;
//class declared as final.
public final class Student {
	
	private final int rollno;
	private final String name; // private class members.
	private final Address addr;
	
	public Student(int rollno, String name, Address addr) {
		super();
		this.rollno = rollno; // class members are initialized using constructor.
		this.name = name;
		
		//creates address copy
				
									Address copy=new Address();
									copy.setCountry(addr.getCountry());
									copy.setCity(addr.getCity());
									copy.setPin(addr.getPin());
							
		
		
		
		this.addr = copy;
	}

	// getter method returns the copy of class member 
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Address getAddr() {
		Address copy=new Address();
		copy.setCountry(addr.getCountry());
		copy.setCity(addr.getCity());
		copy.setPin(addr.getPin());

		
		return copy;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
	
	
	

}
