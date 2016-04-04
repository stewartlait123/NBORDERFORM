
public class Customer {
	private long customerID;
	private String full_name;
	private String dob;	
	private String postcode;
	private String house;
	private String addressln1;
	private String addressln2;
	private String addressln3;

	public Customer(String full_name, String dob, String postcode,
			String house, String addressln1, String addressln2,
			String addressln3) {
		this.full_name = full_name;
		this.dob = dob;
		this.postcode = postcode;
		this.house = house;
		this.addressln1 = addressln1;
		this.addressln2 = addressln2;
		this.addressln3 = addressln3;
	}
	
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	
	public long getCustomerID() {
		return customerID;
	}

	public String getFull_name() {
		return full_name;
	}

	public String getPostcode() {
		return postcode;
	}

	@Override
	/**
	 * Prints out Customer: name, address and ID
	 */
	public String toString() {
		return "CUSTOMER: " + full_name + ", D.O.B. : " + dob
				+ ", ADDRESS: " + house + ", " 
				+ addressln1 + ", " + addressln2
				+ ", " + addressln3 + ", " + postcode
				+ ", " + customerID + ".";
	}
	
}