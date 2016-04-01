import java.util.ArrayList;

/**
 * This class holds the arrayLists for use while there is no database
 * @author James Thompson
 */
public class LocalDataStore {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	private static LocalDataStore localDataStore = new LocalDataStore();
	
	/**
	 * This constructor is private so that LocalDataStore can only be instanciated from within itself.
	 */
	private LocalDataStore() {
		addCustomer(new Customer("John Smith", "12/12/1992", "PR3P0ST", "1", "Farm Road", "Preston", "Lancashire"));	
	}
	
	/**
	 * Adds a new customer to the arraylist of customers, incrementing the customer ID if there are already 
	 * customers in the array, setting it to 0 if there are not.
	 * @param customer - the Customer to add
	 */
	public void addCustomer(Customer customer) {
		if (!customers.isEmpty()) {
			Customer c = customers.get(customers.size()-1);
			customer.setCustomerID(c.getCustomerID()+1);
		} else
			customer.setCustomerID(0);
		customers.add(customer);
	}
	
	public Customer findCustomer(String name) {
		
		return null;
	}
	
	public Customer findCustomer(String name, String postcode) {
		//TODO
		return null;
	}
	
	/**
	 * This method returns the only instance of LocalDataStore so that the invoker can access the 
	 * non-static methods in LocalDataStore.
	 * This is because LocalDataStore is a Singleton (Yay for design patterns!!!)
	 * @return returns the instance of LocalDataStore
	 */
	public static LocalDataStore getLocalDataStore() {
		return localDataStore;
	}
}