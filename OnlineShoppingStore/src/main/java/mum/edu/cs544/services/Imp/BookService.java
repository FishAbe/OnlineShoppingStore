/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IBookDAO;
import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Product;
import mum.edu.cs544.services.IBookService;

/**
 * @author Tarekegn
 * @createdDate Aug 28, 2016
 */
@Service
@Transactional
public class BookService implements IBookService {

    @Autowired
    private IBookDAO bookDao;
  //  @Autowired private CategoryDao categoryDao;
    /*@Override
    public void add(Book book) {
        int quantity = book.getQuantity();

         add the product copies 
        if(quantity > 0) {
            while (quantity-- > 0) {
                ProductCopy copy = new ProductCopy();
                book.addProductCopy(copy);
            }
        }
        bookDao.save(book);
    }*/

    @Override
    public void update(Book book) {
        bookDao.save(book);
    }

    @Override
    public void delete(long id) {
        bookDao.delete(id);
    }

    @Override
    public Book findById(long id) {
        return bookDao.findOne(id);
    }

    @Override
    public Set<Book> getAll() {
        Set<Book> result = new HashSet<>();
        bookDao.findAll().forEach(item -> result.add(item));
        return result;
    }


   /* @Override
    public Set<Book> getLastest6Books() {
        return bookDao.findFirst6ByOrderByIdDesc();
    }

    @Override
    public Set<Book> get2SpecialDiscountedBook() {
        return bookDao.findFirst2ByOrderByDiscountDesc();
    }*/
/*
    @Override
    public Set<Book> getBookByCategory(long categoryId) {

       return bookDao.findBookByCategory(categoryDao.findOne(categoryId));
    }
*/

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IBookService#getBookByCategory(long)
	 */
	/*@Override
	public Set<Book> getBookByCategory(long categoryId) {
		
		return null;
	}*/

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		
	}

}

