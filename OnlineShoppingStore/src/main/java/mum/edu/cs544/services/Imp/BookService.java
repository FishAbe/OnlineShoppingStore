/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IAdminDAO;
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
    private IBookDAO _bookDao;
  //  @Autowired private CategoryDao categoryDao;

    @Override
	public void add(Book book) {
		_bookDao.save(book);
		
	}
    @Autowired
	public BookService(IBookDAO bookDao){
		_bookDao = bookDao;
	}
    
 
    @Override
    public void update(Book book) {
        _bookDao.save(book);
    }

    @Override
    public void delete(long id) {
        _bookDao.delete(id);
    }

    @Override
    public Book findById(long id) {
        return _bookDao.findOne(id);
    }

    @Override
    public Set<Book> getAll() {
        Set<Book> result = new HashSet<>();
        _bookDao.findAll().forEach(item -> result.add(item));
        return result;
    }

	

}

