/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.ICarItemDAO;
import mum.edu.cs544.models.CartItem;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.services.ICartItemService;

/**
 * @author Fish
 *
 */
@Service
@Transactional
public class CartItemService implements ICartItemService{
	
	@Autowired
	private ICarItemDAO _cartItemDao;
	
	public CartItemService(ICarItemDAO cartItemDao){
		_cartItemDao = cartItemDao;
	}

	@Override
	public void addItem(CartItem cartItem) {
		_cartItemDao.save(cartItem);
		
	}

	@Override
	public Set<CartItem> getAllCartItem() {
		Set<CartItem> result = new HashSet<>();
        _cartItemDao.findAll().forEach(item -> result.add(item));
		return result;
	}

	@Override
	public Set<CartItem> getCustomerCart(long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem findById(long id) {
		return _cartItemDao.findOne(id);
	}

	@Override
	public void remove(long id) {
		_cartItemDao.delete(id);
		
	}
	
	
	
	

}
