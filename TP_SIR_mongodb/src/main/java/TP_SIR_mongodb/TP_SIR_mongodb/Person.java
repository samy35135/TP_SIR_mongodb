package TP_SIR_mongodb.TP_SIR_mongodb;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

import java.util.List;

@Entity
public class Person {
	@Id
	private ObjectId id;
	private String name;
	@Reference ("listadress")
	private List<Address> address0;

	
	public Person(){
	}
	
	

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Address> getAddress0() {
		return address0;
	}
	public void setAddress0(List<Address> address0) {
		this.address0 = address0;
	}	
	
	
}
