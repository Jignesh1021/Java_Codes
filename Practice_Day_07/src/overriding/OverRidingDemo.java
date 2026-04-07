package overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		RBI rbi;
		
		//dynamic binding assigning child class obj to parent class reference 
		
		rbi=new SBI();
			System.out.println(rbi.getRateOfInterest());
			
			rbi=new ICICI();
			System.out.println(rbi.getRateOfInterest());

	}

}