package TP_SIR_mongodb.TP_SIR_mongodb;


import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Index;
import com.google.code.morphia.annotations.Indexes;
import com.google.code.morphia.annotations.Property;

@com.google.code.morphia.annotations.Entity
//@Indexes(@Index(name = "AddressPK", value = "street, city, postCode, country"))
public class Address {
	@Id
	private ObjectId id;
	//@Property("street")
	private String street;
	//@Property("city")
	private String city;
	//@Property("postCode")
	private String postCode;
	//@Property("country")
	private String country;
	
	
	
	public Address(){
		id=new ObjectId();
	}


	public ObjectId getId() {
		return id;
	}



	public void setId(ObjectId id) {
		this.id = id;
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



	public String getPostCode() {
		return postCode;
	}



	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
