package staticvariblemethod;

public class MyClass {

	private int section;  //non static variable obj
	
	private static int srNo;  // static varibles class
	
	//static block 
	static 
	{
		System.out.println("-------Within static block --------");
		srNo=1000;
		//section=123;
	}
	
	//default constructor 
	MyClass()
	{
		System.out.println("-------Within Default constructor--------");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial no= "+srNo+",section=" + section + "]";
	}
	
	
	//static method 
	static void display ()
	{
		//System.out.println("Section = "+ section);
	
		System.out.println("Serial No : "+srNo);
	}
	
	
}
