package lab2;

import java.util.Arrays;

public class MainOfProg1{
	public static void main(String[] args){
		Address billing1 = new Address("4th street", "fairfield", "IA", "52557");
		Address billing2 = new Address("union street", "chicago", "IL", "60007");
		Address billing3 = new Address("washington street", "Chicago", "IL", "60018");
		Address shipping1 = new Address("4th street", "fairfield", "IA", "52557");
		Address shipping2 = new Address("union street", "chicago", "IL", "60007");
		Address	shipping3 = new Address("washington street", "chicago", "IL", "60018");
		Customer	c1 = new Customer("abdelaziz", "Aboukhame", "111-76-7123");
		Customer	c2 = new Customer("brahim", "hach", "224-16-8900");
		Customer	c3 = new Customer("Jhon", "Jhon", "144-71-2125");

		c1.setBillingAddress(billing1);
		c2.setBillingAddress(billing2);
		c3.setBillingAddress(billing3);
		c1.setShippingAddress(shipping1);
		c2.setShippingAddress(shipping2);
		c3.setShippingAddress(shipping3);

		Customer[]	customers = {c1, c2, c3};
		//print out all customers
		System.out.println(Arrays.toString(customers));
		//print out customers whose have billing address in chicago
		for (Customer c : customers){
			if (c.getBillingAddress().getCity().equalsIgnoreCase("chicago")){
				System.out.println(c);
				System.out.println("city: " + c.getBillingAddress().getCity());
			}
		}

	}
}
