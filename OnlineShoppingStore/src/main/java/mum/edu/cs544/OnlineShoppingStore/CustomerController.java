/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.apache.commons.io.output.ThresholdingOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Customer;
import mum.edu.cs544.models.Order;
import mum.edu.cs544.services.ICustomerService;
import mum.edu.cs544.services.IOrderService;


/**
 * @author Fish
 *
 */
@Controller
public class CustomerController {
	
	
	@Autowired
	private ICustomerService _customerService;
	@Autowired
	private IOrderService _orderService;
	

	@RequestMapping(value = {"/customer", "/Customer"}, method = RequestMethod.GET)
	public String index(Model model) {
       
		Set<Customer> customerList = _customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);

		return "customer/customerlist";
	}
	
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer/addCustomer";
	}
	
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String add(@ModelAttribute ("customer")@Valid Customer customer, BindingResult result,Model mode) {
        customer.setAddress(customer.getAddress());
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError e: errors){
			System.out.println(e.getDefaultMessage());
		}
		
		
		if(result.hasErrors())
			return "customer/addCustomer";
		//System.out.println(customer.getBilingAddress().getCountry());
		
		_customerService.addCustomer(customer);
		return "redirect:/spring/customer";
	}
	
	@RequestMapping(value="/customer/update/{id}",method = RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		Customer customer = _customerService.findById(id);
		model.addAttribute("customer",customer);
		return "customer/updateCustomer";
		
	}
	@RequestMapping(value = "/customer/update/{id}", method = RequestMethod.POST)
	public String update(@Valid Customer customer,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/customer/update/" + id;
		_customerService.updateCustomer(customer);
		
		return "redirect:/spring/customer";
	}
		
  @RequestMapping(value = { "/customer/orders"}, method = RequestMethod.GET)
		public String orderHistory(Model model){
	  /**
	   * TODO :current customer should be fetched from the logged in session
	   */
	  
	    Customer customer = _customerService.findById(1);
			List<Order> orders = customer.getOrder();
			model.addAttribute("orders", orders);
			return "customer/orders";
		
	}
	
	@RequestMapping(value = "/customer/delete/{id}", method = RequestMethod.GET )
	public String delete(@PathVariable int id){
		
		_customerService.removeCustomer(id);
		return "redirect:/spring/customer";
	}

}
