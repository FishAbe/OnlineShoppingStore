/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Book;
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
	
	public String addToCart(Book book){
		return "product/carts";
	}
	
}
