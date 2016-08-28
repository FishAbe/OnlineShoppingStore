/**
 * 
 */
package mum.edu.cs544.services;

import java.util.Set;

import mum.edu.cs544.models.Order;
import mum.edu.cs544.models.OrderLine;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
public interface IOrderLineService {
	void addOrderLine(OrderLine orderLine);
    void updateOrderLine(OrderLine orderLine);
    void deleteOrderLine(long id);
    OrderLine findById(long id);
    Set<OrderLine> getAllOrderLines();
}
