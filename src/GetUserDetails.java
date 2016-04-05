import java.util.ArrayList;
import java.util.Scanner;


public class GetUserDetails {
	Scanner user_input;

	public static void main(String[] args) {
		GetUserDetails getUserDetails = new GetUserDetails();
		// ASKING USER FOR CUSTOMER DETAILS.
		getUserDetails.verifyCustomer();
	}

	public GetUserDetails() {
		user_input = new Scanner(System.in);
	}

	public void addCustomer() {
		String first_name;
		print("Enter customer first name: ");
		first_name = user_input.next();

		String second_name;
		print("Enter customer second name: ");
		second_name = user_input.next();

		String dob;
		System.out.print("Enter customer D.O.B. (DD/MM/YYYY): ");
		dob = user_input.next();

		String postcode;
		System.out.print("Enter customer postcode: ");
		postcode = user_input.next();

		String house;
		System.out.print("Enter customer house name/number: ");
		house = user_input.next();

		String addressln1;
		System.out.print("Enter customer street: ");
		addressln1 = user_input.next();

		String addressln2;
		System.out.print("Enter customer town/city: ");
		addressln2 = user_input.next();

		String addressln3;
		System.out.print("Enter cutsomer county: ");
		addressln3 = user_input.next();
		
		

		Customer customer = new Customer(first_name + " " + second_name, dob,
				postcode, house, addressln1, addressln2, addressln3);

		LocalDataStore.getLocalDataStore().addCustomer(customer);
		System.out.println(customer.toString());
	}

	/*
	 * This method prints a string in the pre-approved format
	 * 
	 * @param string - The string to print
	 */
	private void print(String string) {
		System.out.println("> " + string);
	}

	public void verifyCustomer() {
		ArrayList<Customer> customers = LocalDataStore.getLocalDataStore().findCustomer(
				getUserInput("first name") + " " + getUserInput("last name"), getUserInput("postcode"));

		/*
		 * ASKING SYSTEM TO VERIFY IF CUSTOMER IS ALREADY REGISTERED IF NOT THEN
		 * INITIATE REGISTRATION PROCESS
		 */

		if (!customers.isEmpty()) {
			//for each Customer object which we will call 'customer' in the array customers we want to do the following
			for(Customer customer : customers) {
				System.out.println(customer.toString());
			}
		} else {
			print("Customer not found, please register the customer.");
			addCustomer();

		}

	}

	private String getUserInput(String thingWeWant) {
		print("Please enter " + thingWeWant + ":");
		return user_input.next();
	}

}