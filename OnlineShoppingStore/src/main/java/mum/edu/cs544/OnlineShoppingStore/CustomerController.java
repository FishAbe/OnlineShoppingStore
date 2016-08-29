/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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

		List<Customer> customerList = Arrays.asList(new Customer(),new Customer());
		model.addAttribute("customerList", customerList);

		return "customer/customerlist";
	}
	
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer/addCustomer";
	}
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String add(@Valid Customer customer, BindingResult result) {

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

}
