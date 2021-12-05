
public class Customer {
	private int accountID;
	private String email;
	private Ticket[] ticketOrders;
	private String paymentMethod;
	private static int MAX_ORDERS = 3; // max number of tickets a customer can order
	
	public Customer(int id, String email) {
		this.accountID = id;
		this.email = email;
		this.ticketOrders = new Ticket[MAX_ORDERS];
		this.paymentMethod = "";
		
	}
	
	public int getID() {
		return accountID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean updatePaymentMethod(String paymentMethod) {
		// customer can update payment method. returns true if valid payment method added
		String[] validPaymentMethods = {"credit", "debit"};
		
		String method = paymentMethod.toLowerCase();
		
		for (int i = 0; i < validPaymentMethods.length; i++) {
			if (method.equals(validPaymentMethods[i])) {
				paymentMethod = method;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean updateEmail(String newEmail) {
		email = newEmail;
		return true;
	}
	
	public boolean orderTicket() {
		return false;
	}
	
	public boolean cancelTicket() {
		return false;
	}
}
