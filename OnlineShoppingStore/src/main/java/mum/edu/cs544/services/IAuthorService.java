/**
 * 
 */
package mum.edu.cs544.services;

import java.util.List;
import mum.edu.cs544.models.Author;

/**
 * @author Fish
 *
 */
public interface IAuthorService {

	void addAuthor(Author author);

	Author findByid(long id);

	void updateAuthor(Author author);

	List<Author> getAllAuthors();

	void remove(long id);

}
