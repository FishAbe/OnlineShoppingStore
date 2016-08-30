/**
 * 
 */
package mum.edu.cs544.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.CartItem;

/**
 * @author Fish
 *
 */
@Repository
public interface ICarItemDAO extends CrudRepository<CartItem, Long>{

}
