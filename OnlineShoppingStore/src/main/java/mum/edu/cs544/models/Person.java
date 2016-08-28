package mum.edu.cs544.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.validator.constraints.Email;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
@Entity
@Table(name="USER")
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
	
	 public Person(String firstName, String lastName, Address address,
             String email, String password
             ){
   this.email = email;
   this.password = password;
   this.firstName = firstName;
   this.lastName = lastName;
   this.address = address;
}

public Person(String email, String password){
   this.email = email;
   this.password = password;
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
