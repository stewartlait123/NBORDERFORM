package ops;
import java.util.Set;


public class Customer {
	private long customerID;
	private String full_name;
	private String dob;	
	private String postcode;
	private String house;
	private String addressln1;
	private String addressln2;
	private String addressln3;
	private double balance;

	public Customer(String full_name, String dob, String postcode,
			String house, String addressln1, String addressln2,
			String addressln3){
		this(full_name, dob, postcode, house, addressln1, addressln2, addressln3, 0.00);
	}
	
	public Customer(String full_name, String dob, String postcode,
			String house, String addressln1, String addressln2,
			String addressln3, double balance) {
		this.full_name = full_name;
		this.dob = dob;
		this.postcode = postcode;
		this.house = house;
		this.addressln1 = addressln1;
		this.addressln2 = addressln2;
		this.addressln3 = addressln3;
		this.balance = balance;
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

	public void setBalance(double b){
		balance = b;
		
	}
	
	public double getBalance(){
		return balance;
	}
	
	
	
	
	@Override
	/**
	 * Prints out Customer: name, address and ID
	 */
	public String toString() {
		CreditCheck cc=new CreditCheck();
		return "CUSTOMER: " + full_name + ", D.O.B. : " + dob
				+ " ADDRESS: " + house + ", " 
				+ addressln1 + ", " + addressln2
				+ ", " + addressln3 + ", " + postcode
				+ ". " + "CustomerID: = " + customerID
				+ " Balance:" + String.valueOf(balance) + " : " + cc.balance(balance);
	}
	
		
	
	
}