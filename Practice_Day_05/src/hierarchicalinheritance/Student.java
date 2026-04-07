package hierarchicalinheritance;

public class Student extends Person{

	
	private String CLASS;
	private float percent;
	
	public Student() {
		System.out.println("Student class default constructor ");
		CLASS="fy";
		percent = 70f;
	}

	public Student(String name, String city,String cLASS, float percent) {
		super( name,  city);
		CLASS = cLASS;
		this.percent = percent;
	}

	public String getCLASS() {
		return CLASS;
	}

	public void setCLASS(String cLASS) {
		CLASS = cLASS;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [CLASS=" + CLASS + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
	
}
