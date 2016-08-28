/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IBookDAO;
import mum.edu.cs544.dao.ICustomerDAO;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.ICustomerService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Service
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerDAO _customerDao;

    @Autowired
   	public CustomerService(ICustomerDAO customerDao){
    	_customerDao = customerDao;
   	}
   
    @Override
    public void addCustomer(Customer customer) {
        _customerDao.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        _customerDao.save(customer);
    }


    @Override
    public void removeCustomer(long id) {
        _customerDao.delete(id);
    }

    @Override
    public Customer findById(long id) {
        return _customerDao.findOne(id);
    }

    @Override
    public Set<Customer> getAllCustomers() {
        Set<Customer> result = new HashSet<>();
        _customerDao.findAll().forEach(item -> result.add(item));
        return result;
    }
    @Override
    public Customer getCustomer(String email, String password) {
        return _customerDao.getUserByCredentials(email, password);


    }


}
