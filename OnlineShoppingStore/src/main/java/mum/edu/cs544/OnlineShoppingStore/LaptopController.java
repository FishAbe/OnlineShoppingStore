/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Customer;
import mum.edu.cs544.models.Laptop;
import mum.edu.cs544.services.IBookService;
import mum.edu.cs544.services.ILaptopService;



/**
 * @author Tarekegn
 * @createdDate Aug 29, 2016
 */

@Controller
public class LaptopController {
	
	@Autowired
	private ILaptopService _laptopService;
	

	@RequestMapping(value = {"/laptop", "/Laptop"}, method = RequestMethod.GET)
	public String index(Model model) {
      
		Set<Laptop> customerList = _laptopService.getAll();
		model.addAttribute("customerList", customerList);

		return "laptop/laptoplist";
	}
	
	
	@RequestMapping(value = "/laptop/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("laptop", new Laptop());
		return "laptop/addLaptop";
	}
	
	@RequestMapping(value = "/laptop/add", method = RequestMethod.POST)
	public String add(@Valid Laptop laptop, BindingResult result) {
      
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
		_laptopService.add(laptop);
	
		System.out.println("Laptop information added");
		
		return "redirect:/laptop";
	}
	

}
