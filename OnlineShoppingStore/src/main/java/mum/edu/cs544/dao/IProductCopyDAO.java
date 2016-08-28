/**
 * 
 */
package mum.edu.cs544.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.ProductCopy;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Repository
public interface IProductCopyDAO extends JpaRepository<ProductCopy,Long> {
}
