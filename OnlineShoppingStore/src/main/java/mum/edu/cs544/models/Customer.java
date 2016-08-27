package mum.edu.cs544.models;

import javax.persistence.*;

public class Customer extends Person{
	
	@Id @GeneratedValue
	private int id;
	
	@OneToOne
	private Order order;
	
	
	
	public Customer(){
		
	}
	
	

	
	
	

}
