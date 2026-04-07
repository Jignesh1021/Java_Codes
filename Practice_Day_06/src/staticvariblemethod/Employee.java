package staticvariblemethod;

public class Employee {

	//Declare instance varible 
	private String name;
	private int id;
	
	//Declare a static varibles companyName with DT String 
	//TNS
	static String companyName = "TNSIF";
	
	//decalre a two parameter constrcutor 
	public Employee(String name, int id )
	{
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= " + companyName+"]";
	}
	
	
	
}
