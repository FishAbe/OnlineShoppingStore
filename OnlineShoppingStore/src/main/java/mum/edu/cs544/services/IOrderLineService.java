/**
 * 
 */
package mum.edu.cs544.services;

import java.util.Set;

import mum.edu.cs544.models.Order;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
public interface IOrderLineService {
	void addOrderLine(Order transaction);
    void updateOrderLine(Order transaction);
    void deleteOrderLine(long id);
    Order findById(long id);
    Set<Order> getAllOrderLine();
}
