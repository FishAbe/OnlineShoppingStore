/**
 * 
 */
package mum.edu.cs544.dao;


import org.springframework.data.repository.CrudRepository;

import mum.edu.cs544.models.OrderLine;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
public interface IOrderLineDAO extends CrudRepository <OrderLine,Long> {

}
