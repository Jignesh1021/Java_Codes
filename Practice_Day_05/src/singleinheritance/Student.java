package singleinheritance;

//child class
public class Student extends Citizen{

	private int rollNo;
	private String collegeName;
	
	//default constructor
	public Student() {
		System.out.println("Child default constructor");
	}
	
	//para constructor
	public Student(String name, String address, String adharNo, long phone,int rollNo, String collegeName) {
		super( name,  address,  adharNo,  phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getAdharNo()=" + getAdharNo() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	
	
	
}

