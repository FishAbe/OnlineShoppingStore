/**
 * 
 */
package mum.edu.cs544.services;

import java.util.List;
import java.util.Set;

import mum.edu.cs544.models.CartItem;

/**
 * @author Fish
 *
 */
public interface ICartItemService {
	
	void addItem(CartItem cartItem);
    Set<CartItem> getAllCartItem();
	Set<CartItem> getCustomerCart(long customerId);
	CartItem findById(long id);
	void remove(long id);

}
