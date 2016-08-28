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
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private Date dateOfBirth;
	
	//private List<Book> books;
	
	
	public Author(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}
	
	
	
	

}
