package mum.edu.cs544.models;
/**
 * @author Tarekegn
 * @createdDate Aug 27, 2016
 */
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.*;
import org.springframework.beans.factory.annotation.Value;

@Embeddable
public class Address {

	@NotEmpty(message = "Street may not be empty")
    private String street;

	@NotBlank(message="City may not be empty")
    private String city;

	@NotBlank(message="State may not be empty")
    private String state;

	@NotBlank(message="Zip may not be empty")
   @Range(min = 1, max = 999999)
   @Value("52557")
    private String zip;

    public Address() {
    }

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
