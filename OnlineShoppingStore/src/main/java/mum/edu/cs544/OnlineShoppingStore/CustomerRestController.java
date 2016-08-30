/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.Set;

import org.group5.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.ICustomerService;

/**
 * @author Tarekegn
 * @createdDate Aug 30, 2016
 */

@RestController
@RequestMapping("/api/customer/")
public class CustomerRestController {
	
	
	@Autowired
    private ICustomerService _customerService;

    /**********GET All Book *************/
    @RequestMapping("all")
    public @ResponseBody Set<Customer> findAllBooks(){
        return _customerService.getAllCustomers();
    }
  
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Customer findSingleCustomerById(@PathVariable int id){
        return _customerService.findById(id);
    }
    
    @RequestMapping("delete/{id}")
    public void deleteCustomer(@PathVariable int id){
    	_customerService.removeCustomer(id);
    }

    



}
