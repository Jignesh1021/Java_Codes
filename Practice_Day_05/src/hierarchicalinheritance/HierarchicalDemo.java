package hierarchicalinheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("------------Person details ");
		System.out.println(p1);
		
		//dynamic memory allocation 
		Person p;
		p=new Person("Jignesh", "Mumbai");
		System.out.println("Person Details : "+p);
		
		p=new Employee("Om", "Delhi", 1001, 45334f, "IT");
		System.out.println("Employee Details : "+ p);
		
		p=new Student("Vivek", "hyderabad", "SY", 88.99f);
		System.out.println("Student Details : "+ p);
		

	}

}
