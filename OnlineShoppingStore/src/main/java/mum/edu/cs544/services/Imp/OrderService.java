/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.services.IOrderService;
import mum.edu.cs544.dao.IOrderDAO;
import mum.edu.cs544.dao.OrderDao;
import mum.edu.cs544.models.Order;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
@Service
@Transactional
public class OrderService implements IOrderService{
	 @Autowired
	    private OrderDao orderDao;

	    @Override
	    public void addOrder(Order order) {
	        orderDao.save(order);
	    }

	    @Override
	    public void updateOrder(Order order) {
	        orderDao.save(order);
	    }

	    @Override
	    public void deleteOrder(long id) {
	        orderDao.delete(id);
	    }

	    @Override
	    public Order findById(long id) {
	        return orderDao.findOne(id);
	    }

	    @Override
	    public Set<Order> getAllOrders() {
	        Set<Order> result = new HashSet<>();
	        orderDao.findAll().forEach(item -> result.add(item));
	        return result;
	    }

		
}
