/**
 * 
 */
package mum.edu.cs544.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Order;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Repository
public interface IOrderDAO extends CrudRepository<Order,Long> {
	 Set<Order> findFirst3ByOrderByIdDesc();
	 @Query("SELECT o FROM Order o WHERE o.customer.id=id")
	    Set<Order> getOrderByCustomer(@Param("id") long id);
	
}
