/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import mum.edu.cs544.dao.OrderDao;
import mum.edu.cs544.models.Order;
import mum.edu.cs544.models.OrderLine;
import mum.edu.cs544.services.IOrderLineService;
import mum.edu.cs544.services.IOrderService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
public class OrderLineService implements IOrderLineService{
	 @Autowired
	    private OrderDao orderDao;

	    @Override
	    public void addOrderLine(Order order) {
	        orderDao.save(order);
	    }

	    @Override
	    public void updateOrderLine(Order order) {
	        orderDao.save(order);
	    }

	    @Override
	    public void deleteOrderLine(long id) {
	        orderDao.delete(id);
	    }

	    @Override
	    public Order findById(long id) {
	        return orderDao.findOne(id);
	    }
/*
	    @Override
	    public Set<OrderLine> getAllOrderLines() {
	        Set<OrderLine> result = new HashSet<>();
	        orderDao.findAll().forEach(item -> result.add(item));
	        return result;
	    }
*/	    
}
