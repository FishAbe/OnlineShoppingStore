/**
 * 
 */
package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Order;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Repository
public interface OrderDao extends JpaRepository<Order,Long> {
}
