
public class CountryCases {
	private long confirmedCases;
	private String country;
	
	public CountryCases() {
		setConfirmedCases(0);;
		setCountry("");		
	}
	
	public CountryCases(long confirmedCases, String country) {
		this.setConfirmedCases(confirmedCases);;
		this.setCountry(country);		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getConfirmedCases() {
		return confirmedCases;
	}

	public void setConfirmedCases(long confirmedCases) {
		this.confirmedCases = confirmedCases;
	}


}
