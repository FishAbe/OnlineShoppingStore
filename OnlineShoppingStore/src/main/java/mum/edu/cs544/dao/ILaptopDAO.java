/**
 * 
 */
package mum.edu.cs544.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Laptop;


@Repository
public interface ILaptopDAO extends CrudRepository<Laptop,Long> {
	    //we don't need an implementation and or method unless we want to do something extra

	    @Query("SELECT b FROM Laptop b")
	    List<Laptop> getBookWithCategory();

	      //Get the top book by Id
	      Set<Laptop> findFirst6ByOrderByIdDesc();

	      Set<Laptop> findFirst2ByOrderByDiscountDesc();

	     // Set<Book> findBookByCategory(Category category);
}