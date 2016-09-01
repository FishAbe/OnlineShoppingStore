
package mum.edu.cs544.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.validator.constraints.NotBlank;

import mum.edu.cs544.models.Enum.Genre;

/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
@Entity
@DiscriminatorValue("Laptop")
public class Laptop extends Product {
	
	@NotBlank(message="SerialNo may not be empty")
	 private String serialNo;
	@NotBlank(message="Brand Type may not be empty")
	 private String type;
	 
	 public Laptop(String name, String description, String serialNo, String type) {
	        super(name, description);
	        this.serialNo = serialNo;
	        this.type = type;
	    }

	    public Laptop(){
	    }

		public String getSerialNo() {
			return serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

}
