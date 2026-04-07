package usingfinal;

public class FinalVariable {

	//final int x;  //final instance variable should be ini compulsory
	
	final int x=100;
	
	final static int y;
	
	final static int z=10;
	
	//instance method 
	void change()
	{
		//x=30;
		//y=200;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y=" + y+"]";
	}
	
	//declare a static block to intialize the final static variables 
	static {
		y=20;
		//z=98;  once intialized can't be re assigned 
		System.out.println("Value of Z: "+ z);
		System.out.println("Value of y :"+ y);
		//System.out.println("Value of x: "+ x);
	}
//	static {
//		y=98;
//	}
	
	
	
	
	
	
}