/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.omg.CORBA._PolicyStub;
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
import mum.edu.cs544.models.Order;
import mum.edu.cs544.models.OrderLine;
import mum.edu.cs544.models.Product;
import mum.edu.cs544.models.Enum.OrderStatus;
import mum.edu.cs544.services.IBookService;
import mum.edu.cs544.services.ICartItemService;
import mum.edu.cs544.services.ICustomerService;
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
	@Autowired
	private ICustomerService _customerService;

	@RequestMapping(value = { "/product", "/Product" }, method = RequestMethod.GET)
	public String products(Model model) {
		Set<Book> books = _bookService.getAll();
		// model.addAttribute("products", books);
		return "product/products";
	}

	@RequestMapping(value = { "/product/detail/{id}" }, method = RequestMethod.GET)
	public String productDetail(@PathVariable int id, Model model) {

		return "product/detail";
	}

	@RequestMapping(value = "/product/addToCart/{id}", method = RequestMethod.GET)
	public String addToCart(@PathVariable int id) {

		CartItem item = new CartItem();
		item.setCustomerId(2);
		item.setProductId(10);
		item.setQuantity(2);
		item.setUnitPrice(20.5);
		item.setSubtotal(item.getSubtotal());
		_cartService.addItem(item);

		return "redirect:/spring/product/carts";
	}

	@RequestMapping(value = { "/product/carts" }, method = RequestMethod.GET)
	public String carts(Model model) {

		Set<CartItem> cartItems = _cartService.getAllCartItem();
		model.addAttribute("cartItems", cartItems);

		return "/product/carts";
	}

	@RequestMapping(value = { "/cart/delete/{id}" }, method = RequestMethod.GET)
	public String delete(@PathVariable int id) {

		_cartService.remove(id);
		return "redirect:/spring/product/carts";
	}

	@RequestMapping(value = { "/cart/checkout" }, method = RequestMethod.GET)
	public String checkout(Model model) {
		Set<CartItem> cartItems = _cartService.getAllCartItem();
		if (cartItems.size() > 0) {
			Order order = new Order();
			Date today = Calendar.getInstance().getTime();
			order.setOrderDate(today);
			order.setOrderStatus(OrderStatus.New);
			List<OrderLine> orderLines = new ArrayList<>();
			double total = 0;
			for (CartItem cartItem : cartItems) {
				OrderLine orderLine = new OrderLine();
				Product product = getProduct(cartItem.getProductId());
				orderLine.setProduct(product);
				orderLine.setDeliveryDate(today);
				orderLine.setQuantity(cartItem.getQuantity());
				orderLines.add(orderLine);
				total += product.getPrice()*cartItem.getQuantity();
			}
			order.setOrderLineItems(orderLines);
			order.setTotalOrderPrice(total);
			order.setCustomer(_customerService.findById(1));
			_orderService.addOrder(order);
			for (CartItem cartItem : cartItems) {
				_cartService.remove(cartItem.getId());
			}
			return "redirect:/spring/product/carts";
		}
		return "redirect:/spring/product";
	}

	private Product getProduct(long productId) {

		return _bookService.findById(productId);
	}

}
