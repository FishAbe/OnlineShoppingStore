package mum.edu.cs544.models;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;


@Entity
public class Admin extends Person {
	
	
	private int id;
	
	@Email
	private String email;
	
	public Admin(){
		
	}
	

}
