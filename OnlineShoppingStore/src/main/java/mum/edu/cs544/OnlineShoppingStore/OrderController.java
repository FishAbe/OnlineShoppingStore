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
import mum.edu.cs544.models.CartItem;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.IBookService;
import mum.edu.cs544.services.ICartItemService;
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
	
	@Autowired
	private ICartItemService _cartService;
	
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
	@RequestMapping(value = "/product/addToCart/{id}", method = RequestMethod.GET)
	public String addToCart(@PathVariable int id){
		
		CartItem item = new CartItem();
		item.setCustomerId(1);
		item.setProductId(1);
		item.setQuantity(1);
		item.setUnitPrice(20.5);
		item.setSubtotal(item.getSubtotal());
	    _cartService.addItem(item);
		
		return "redirect:/spring/product/carts";
	}
	
	@RequestMapping(value = {"/product/carts"}, method = RequestMethod.GET)
	public String carts(Model model) {
       
		Set<CartItem> cartItems = _cartService.getAllCartItem();
		model.addAttribute("cartItems", cartItems);

		return "/product/carts";
	}
	
	@RequestMapping(value = {"/cart/delete/{id}"}, method = RequestMethod.GET)
   public String delete(@PathVariable int id){
		
		_cartService.remove(id);
		return "redirect:/spring/product/carts";
	}
	
}
