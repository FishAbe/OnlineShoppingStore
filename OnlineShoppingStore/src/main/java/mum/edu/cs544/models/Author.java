/**
 * 
 */
package mum.edu.cs544.models;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Fish
 *
 */
@Entity
public class Author {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date dateOfBirth;
	
	//private List<Book> books;
	
	

}
