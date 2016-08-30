/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Customer;
import mum.edu.cs544.models.Enum.Genre;
import mum.edu.cs544.models.Enum.Status;
import mum.edu.cs544.services.IBookService;

/**
 * @author Tarekegn
 * @createdDate Aug 29, 2016
 */
@Controller
public class BookController {
	
   @Autowired
   IBookService _bookService;
	
   @RequestMapping("/book") //annotation is necesssary for default one too.
	public String getAllBooks(Model model) {
     //   model.addAttribute("books", bookService.getAll());
	   
	 /*  Book book = new Book();
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
*/
	   Set<Book> bookList= _bookService.getAll();
		model.addAttribute("bookList", bookList);
	   
        return "book/booklist";
    }

   @RequestMapping(value = "/book/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("book", new Book());
		return "book/addBook";
	}
   
   
   @RequestMapping(value = "/book/add", method = RequestMethod.POST)
	public String add( Book book, BindingResult result) {
       
	   
	   System.out.println(result.hasErrors());
		
		System.out.println("ErrorCount" + result.getErrorCount());
		System.out.println(result.getAllErrors());
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError e: errors){
			System.out.println(e.getDefaultMessage());
		}
		
		
		if(result.hasErrors())
			return "book/addBook";		 
		
		   _bookService.add(book);
	
		System.out.println("Book added");
		
		return "redirect:/book";
	}
   
   
    @RequestMapping(value="/{id}")
    public String getBookByTitle(@PathVariable("id") long id, Model model) {
        model.addAttribute("book", _bookService.findById(id));
        return "book/booklist";
    }
    
    
    @RequestMapping(value="/book/update/{id}",method = RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		Book book = _bookService.findById(id);
		model.addAttribute("book",book);
		return "book/updateBook";
		
	}
	@RequestMapping(value = "/book/update/{id}", method = RequestMethod.POST)
	public String update(@Valid Book book,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/book/update/" + id;
		_bookService.update(book);
		
		return "redirect:/spring/book";
	}
	
	@RequestMapping(value = "/book/delete/{id}", method = RequestMethod.GET )
	public String delete(@PathVariable int id){
		
		_bookService.delete(id);
		return "redirect:/spring/book";
	}

   
}
