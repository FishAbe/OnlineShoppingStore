/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.IBookService;
import mum.edu.cs544.services.IOrderService;

/**
 * @author Fish
 *
 */
@Controller
public class OrderController {
	@Autowired
	private IOrderService _orderService;
	@Autowired
	private IBookService _bookService;
	
	@RequestMapping(value = {"/product", "/Product"}, method = RequestMethod.GET)
	public String products(Model model){
		Set<Book> books = _bookService.getAll();
		//model.addAttribute("products", books);	
		return "product/products";
	}
	
	@RequestMapping(value = {"/product/detail/{id}"}, method = RequestMethod.GET)
	public String productDetail(@PathVariable int id,Model model){
		
		return "product/detail";
	}
	@RequestMapping(value = "/product/detail/{id}", method = RequestMethod.POST)
	public String updaddToCartate(@Valid Book book,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/product/detail/" + id;
		//_customerService.updateCustomer(customer);
		
		return "redirect:/product/carts";
	}
	
	
}
