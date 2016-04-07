package ops;
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
		addCustomer(new Customer("John Smith", "12/12/1992", "PR3P0ST", "1", "Farm Road", "Preston", "Lancashire", 1000));	
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
		} else {
			customer.setCustomerID(1);
			customers.add(customer);
		}
	}
	
	public ArrayList<Customer> findCustomer(String name) {
		ArrayList<Customer> results = new ArrayList<Customer>();
		//first, we need to check every element in the array:
		for(Customer c: customers){
			//Check the names are the same
			if(c.getFull_name().equalsIgnoreCase(name)){
				//return if so
				results.add(c);
			}
		}
		return results;
	}
	
	public ArrayList<Customer> findCustomer(String name, String postcode) {
		ArrayList<Customer> results = new ArrayList<Customer>();
		//Checking every element in array, again
		for(Customer c: customers){
				//check the names are the same
				if(c.getFull_name().equalsIgnoreCase(name)){
					//check the postcodes are the same
					if(c.getPostcode().equalsIgnoreCase(postcode)){
					results.add(c);
					}	
				}
			}
		
		return results;
	}
	
	
//	
//	public Customer findCustomer(String name, String postcode) {
	//Checking every element in array, again
//	for(Customer c: customers){
//			//check the names are the same
//			if(c.getFull_name().equalsIgnoreCase(name)){
//				//check the postcodes are the same
//				if(c.getPostcode().equalsIgnoreCase(postcode));
//				 return the custmer that matches the details
//			}
//		}
//		return an empty result as none was found;
//	}
	
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