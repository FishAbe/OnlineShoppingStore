package mum.edu.cs544.services;

import java.util.List;
import java.util.Set;

import mum.edu.cs544.models.Customer;

public interface ICustomerService {

	void addCustomer(Customer customer);

	 Customer findById(long id);

	void updateCustomer(Customer customer);
	
	Set<Customer> getAllCustomers();
	
	void removeCustomer(long id);
	
	Customer getCustomer(String email, String password);
	
}
