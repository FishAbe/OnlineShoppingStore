package mum.edu.cs544.services;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */

import java.util.Set;

import mum.edu.cs544.models.Order;
public interface IOrderService {
	   void addOrder(Order transaction);
	    void updateOrder(Order transaction);
	    void deleteOrder(long id);
	    Order findById(long id);
	    Set<Order> getAllOrder();
}
