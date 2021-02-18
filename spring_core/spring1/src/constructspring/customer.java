package constructspring;

public class customer {
	private int customerId;
	private String customerName;
	private int customerContact;

	private address Address;
	public customer(int customerId, String customerName, int customerContact, address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		Address = address;
	}
	public address getAddress() {
		return Address;
	}
	public void setAddress(address address) {
		Address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	
	public void displayInfo() {
		System.out.println(customerId+" "+customerName+" "+customerContact+" "+getAddress().getStreet()+" "+getAddress().getState()+" "+getAddress().getZip()+" "+getAddress().getCountry());}
	
}
