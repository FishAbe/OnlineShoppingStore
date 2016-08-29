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
	
    @NotNull(message="First Name is Required")
	private String firstName;
	
    @NotNull(message="First Name is Required")
	private String lastName;
	
    @Email(message="Invalid Email!")
	private String email;
	
    @NotNull
	private String userName;
	
    @NotNull
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(long id) {
		this.id = id;
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
