package mum.edu.cs544.services;

import java.util.List;

import mum.edu.cs544.models.Customer;

public interface ICustomerService {

	void addCustomer(Customer customer);

	 Customer findById(int id);

	void updateCustomer(Customer customer);
	
	List<Customer> getAllCustomers();
	
	void remove(Customer customer);
	
	

}
