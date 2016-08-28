package mum.edu.cs544.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.validator.constraints.Email;

@Entity
public class Person {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
    @NotNull
	private String firstName;
	
    @NotNull
	private String lastName;
	
    @Email
	private String email;
	
    @NotNull
	private String userName;
	
    @Null
	private String password;
    
    private Address address;
	
	public Person(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
