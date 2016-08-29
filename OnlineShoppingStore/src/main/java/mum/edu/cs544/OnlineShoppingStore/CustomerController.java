/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "home";
	}
	
	
	

}
