/**
 * 
 */
package mum.edu.cs544.dao;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs544.models.CartItem;

/**
 * @author Fish
 *
 */
public interface ICarItemDAO extends CrudRepository<CartItem, Long>{

}
