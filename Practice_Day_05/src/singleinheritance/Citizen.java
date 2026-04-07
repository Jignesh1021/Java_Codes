package singleinheritance;

//parent class
public class Citizen {

	private String name;
	private String address;
	private String adharNo;
	private long phone;
	
	//Non para
	public Citizen() {
		System.out.println("Citizen obj created");
	}

//para constrauctor
	public Citizen(String name, String address, String adharNo, long phone) {
		
		this.name = name;
		this.address = address;
		this.adharNo = adharNo;
		this.phone = phone;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhone() {
		
		
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//to String 
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", adharNo=" + adharNo + ", phone=" + phone + "]";
	}
	
	
	
	
}
