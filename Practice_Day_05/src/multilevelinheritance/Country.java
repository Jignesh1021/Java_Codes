package multilevelinheritance;

public class Country {

	
	//data members
	private String countryName;
	private String capital;
	
	//getter and setter 
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//to STring 
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}

	
	
}
