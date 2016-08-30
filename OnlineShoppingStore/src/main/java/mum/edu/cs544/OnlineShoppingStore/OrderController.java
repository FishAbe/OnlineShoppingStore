/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.awt.print.Book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.services.IBookService;
import mum.edu.cs544.services.IOrderService;

/**
 * @author Fish
 *
 */
@Controller
public class OrderController {
	private IOrderService _orderService;
	
	private IBookService _bookService;
	
	@RequestMapping(value = {"/product", "/Product"}, method = RequestMethod.GET)
	public String products(){
		
		return "product/products";
	}
	
	public String productDetail(int id){
		return "product/Detail";
	}
	
	public String addToCart(Book book){
		return "product/carts";
	}
	
}
