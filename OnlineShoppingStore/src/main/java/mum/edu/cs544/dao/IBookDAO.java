/**
 * 
 */
package mum.edu.cs544.dao;

import java.util.List;
import java.util.Set;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Product;


/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Repository
public interface IBookDAO extends CrudRepository<Book,Long> {
	    //we don't need an implementation and or method unless we want to do something extra

	    @Query("SELECT b FROM Book b")
	    List<Book> getBookWithCategory();

	      //Get the top book by Id
	      Set<Book> findFirst6ByOrderByIdDesc();

	      Set<Book> findFirst2ByOrderByDiscountDesc();

		/**
		 * @param p
		 * @return
		 */
	   //   @Query("SELECT quantity FROM Book b ")
		// int getProductCopiess(Product p);

	     // Set<Book> findBookByCategory(Category category);
}
