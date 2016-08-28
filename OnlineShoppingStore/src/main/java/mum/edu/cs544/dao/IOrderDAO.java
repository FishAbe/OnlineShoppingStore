/**
 * 
 */
package mum.edu.cs544.dao;

import org.group5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */

public interface IOrderDAO extends CrudRepository<Order,Long> {

	
}
