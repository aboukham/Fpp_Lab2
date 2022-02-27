package lab2;

public class Customer{
	private String	firstName;
	private String	lastName;
	private String	socSecurityNum;
	private Address	billingAddress;
	private Address	shippingAddress;

	public Customer(String fName, String lName, String ssn){
		this.firstName = fName;
		this.lastName = lName;
		this.socSecurityNum = ssn;

	}

	public void setFirstName(String fName){
		this.firstName = fName;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String lName){
		this.lastName = lName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setSocSecurityNum(String ssn){
		this.socSecurityNum = ssn;
	}

	public String getSocSecurityNum(){
		return this.socSecurityNum;
	}

	public void setBillingAddress(Address bAdd){
		this.billingAddress = bAdd;
	}

	public Address getBillingAddress(){
		return this.billingAddress;
	}

	public void setShippingAddress(Address sAdd){
		this.shippingAddress = sAdd;
	}

	public Address getShippingAddress(){
		return this.shippingAddress;
	}

	public String toString(){
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}
}
