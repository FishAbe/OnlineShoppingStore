package mum.edu.cs544.models;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
public class Payment {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Date paymentDate;
	
	@OneToOne
	private Order order;
	
	

}
