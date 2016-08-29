package mum.edu.cs544.services;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */

import java.util.Set;

import mum.edu.cs544.models.Product;
import mum.edu.cs544.models.Book;
public interface IBookService {
	void add(Book book);
    void update(Book book);
    void delete(long id);
    Book findById(long id);
    Set<Book> getAll();

    /*int getProductCopies(Product p);*/
/*
    Set<Book> getLastest6Books();

    Set<Book> get2SpecialDiscountedBook();

    Set<Book> getBookByCategory(long categoryId);*/
}
