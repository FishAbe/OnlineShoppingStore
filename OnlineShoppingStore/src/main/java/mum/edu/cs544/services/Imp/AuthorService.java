/**
 * 
 */
package mum.edu.cs544.services.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.dao.IAuthorDAO;
import mum.edu.cs544.models.Author;
import mum.edu.cs544.services.IAuthorService;

/**
 * @author Fish
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Component
public class AuthorService implements IAuthorService {
    
	private IAuthorDAO _authorDao;
	
	@Autowired
	public AuthorService(IAuthorDAO authorDao){
		_authorDao = authorDao;
	}
	
	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAuthorService#addAuthor(mum.edu.cs544.models.Author)
	 */
	public void addAuthor(Author author) {

       _authorDao.save(author);

	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAuthorService#findByid(long)
	 */
	public Author findByid(long id) {
		
		return _authorDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAuthorService#updateAuthor(mum.edu.cs544.models.Author)
	 */
	public void updateAuthor(Author author) {

         _authorDao.save(author);

	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAuthorService#getAllAuthors()
	 */
	public List<Author> getAllAuthors() {
		
		return _authorDao.findAll();
	}

	/* (non-Javadoc)
	 * @see mum.edu.cs544.services.IAuthorService#remove(mum.edu.cs544.models.Author)
	 */
	public void remove(long id) {
		_authorDao.delete(id);
		
	}

}
