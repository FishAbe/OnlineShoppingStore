/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.ICustomerService;


/**
 * @author Fish
 *
 */
@Controller
public class CustomerController {
	
	
	@Autowired
	private ICustomerService _customerService;
	

	@RequestMapping(value = {"/customer", "/Customer"}, method = RequestMethod.GET)
	public String index(Model model) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setEmail("abebefisseha@gmail.com");
        customer.setFirstName("fisseha");
        customer.setLastName("chari");
        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setEmail("abebefisseha@gmail.com");
        customer2.setFirstName("fisseha");
        customer2.setLastName("chari");
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer);
		customerList.add(customer2);
		model.addAttribute("customerList", customerList);

		return "customer/customerlist";
	}
	
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer/addCustomer";
	}
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String add(Customer customer, BindingResult result) {
        customer.setUserName("fiseha");
        customer.getAddress().setCity("fjksf");
        customer.getAddress().setState("usa");
		System.out.println(result.hasErrors());
		
		System.out.println("ErrorCount" + result.getErrorCount());
		System.out.println(result.getAllErrors());
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError e: errors){
			System.out.println(e.getDefaultMessage());
		}
		
		
		if(result.hasErrors())
			return "customer/addCustomer";
		//System.out.println(customer.getBilingAddress().getCountry());
		_customerService.addCustomer(customer);
	
		System.out.println("Customer added");
		
		return "redirect:/customer";
	}
	
	@RequestMapping(value="/customer/update/{id}",method = RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		Customer customer = _customerService.findById(id);
		model.addAttribute("customer",customer);
		return "customer/update";
		
	}
	@RequestMapping(value = "/customer/update/{id}", method = RequestMethod.POST)
	public String update(@Valid Customer customer,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/customer/update/" + id;
		_customerService.updateCustomer(customer);
		
		return "redirect:/customer";
	}

}
