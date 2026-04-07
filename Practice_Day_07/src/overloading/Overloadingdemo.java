package overloading;

public class Overloadingdemo {

	public static void main(String[] args) {
	
		System.out.println("--------Constructor Overloading--------");
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(23.45f);
		System.out.println(p1);
		
		Point p2=new Point(23.12f, 34.54f);
		System.out.println(p2);
		
		System.out.println("--------Method Overloading--------");
		

	}

}