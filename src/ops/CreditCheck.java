package ops;

/** If credit is below £20, then purchase can't be made because cheapest product = £20 
 * 
 */
	public class CreditCheck{
	
	public String balance(double b){
		if (b<= 19.00)
			return "Customer has less than £20 credit, please inform and ask to deposit money.";
		else 
			return "Customer has more than £20 credit, proceed with purchase order.";
	}	
	
}
