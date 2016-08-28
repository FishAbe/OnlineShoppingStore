/**
 * 
 */
package mum.edu.cs544.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mum.edu.cs544.models.Laptop;
import mum.edu.cs544.models.Product;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
public interface ILaptopDAO extends JpaRepository<Laptop,Long> {
	 @Query("SELECT count(pc.id) FROM ProductCopy pc JOIN pc.product p where p=:product")
     int getProductCopies(@Param("product") Product product);

     //Get the top book by Id
     Set<Laptop> findFirst6ByOrderByIdDesc();

     Set<Laptop> findFirst2ByOrderByDiscountDesc();
}
