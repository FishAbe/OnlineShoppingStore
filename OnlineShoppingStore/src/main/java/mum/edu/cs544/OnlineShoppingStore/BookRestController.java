package mum.edu.cs544.OnlineShoppingStore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.cs544.models.Book;
import mum.edu.cs544.services.IBookService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tarekegn
 * @createdDate Aug 30, 2016
 */
@RestController
@RequestMapping("/api/book/")
public class BookRestController {

    @Autowired
    private IBookService bookService;

    /**********GET All Book *************/
    @RequestMapping("all")
    public @ResponseBody Set<Book> findAllBooks(){
        return bookService.getAll();
    }


    @RequestMapping("{id}")
    public @ResponseBody  Book findSingleBook(@PathVariable int id){
        return bookService.findById(id);
    }

    @RequestMapping("delete/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.delete(id);
    }

    @RequestMapping("copy/{id}")
    public  @ResponseBody  int getProductCopy(@PathVariable int id){
        Book book = bookService.findById(id);
        return bookService.getProductCopies(book);
    }

    @RequestMapping("/special")
    public  @ResponseBody Set<Book> getSpecialsBook(){
        return bookService.get2SpecialDiscountedBook();
    }

    @RequestMapping("/latest")
    public  @ResponseBody  Set<Book> getLatestBook(){
        return bookService.getLastest6Books();
    }


}
