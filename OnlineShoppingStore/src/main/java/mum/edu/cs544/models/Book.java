/**
 * 
 */
package mum.edu.cs544.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import mum.edu.cs544.models.Enum.Genre;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
@Entity
@PrimaryKeyJoinColumn(name="product_id")
public class Book extends Product {

    @NotEmpty(message = "ISBN may not be empty")
    @Pattern(regexp = "[0-9]{3}-[0-9]{10}", message = "Please match the ISBN as 111-1234567890")
    @Column(unique = true)
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String name, String description, Genre genre, String isbn, String author) {
        super(name, description);
        this.genre = genre;
        this.isbn = isbn;
    }

    public Book(){
    }

}

