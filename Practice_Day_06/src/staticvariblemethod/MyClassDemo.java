package staticvariblemethod;

public class MyClassDemo {

	public static void main(String[] args) {
		
		MyClass.display();
		System.out.println();
		
		MyClass o1=new MyClass();
		System.out.println(o1);
		
		MyClass.display();
		System.out.println();
		
		MyClass o2=new MyClass();
		System.out.println(o2);   //serial no =1002     section =1
	}

}