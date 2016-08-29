/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.models.Enum.Genre;
import mum.edu.cs544.services.IBookService;

/**
 * @author Tarekegn
 * @createdDate Aug 29, 2016
 */
@Controller
@RequestMapping
public class BookController {
   IBookService bookService;
	
   @RequestMapping("/book") //annotation is necesssary for default one too.
	public String getAllBooks(Model model) {
     //   model.addAttribute("books", bookService.getAll());
	   
	   Book book = new Book();
	   book.setId(1);
	   book.setIsbn("1001");
	   book.setName("JAVA ");
	   book.setGenre(Genre.TECHNOLOGY);
	   book.setAuthor("Tarekegn");
	   book.setPrice(150.00);
       Book book2 = new Book();
       book2.setId(1);
	   book2.setIsbn("1001");
	   book2.setName("JAVA ");
	   book2.setGenre(Genre.TECHNOLOGY);
	   book2.setAuthor("Tarekegn");
	   book2.setPrice(150.00);
		List<Book> bookList = new ArrayList<>();
		bookList.add(book);
		bookList.add(book2);
		model.addAttribute("bookList", bookList);
	   
        return "book/booklist";
    }

   @RequestMapping(value = "/book/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("book", new Book());
		return "book/addBook";
	}
   
    @RequestMapping(value="/{id}")
    public String getBookByTitle(@PathVariable("id") long id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "book/show";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getAddBookForm(Model model, HttpServletRequest request) {
        if(request.getSession().getAttribute("loggedInUser") == null) {
            return "redirect:/login";
        }
        
        Book newBook = new Book();
        model.addAttribute("newBook", newBook);
       
        return "book/add";
    }
}
