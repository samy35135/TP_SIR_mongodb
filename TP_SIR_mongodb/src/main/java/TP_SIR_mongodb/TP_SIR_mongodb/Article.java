package TP_SIR_mongodb.TP_SIR_mongodb;

import java.util.List;





import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Article {
	@Id 
	private ObjectId id;
	private String name;
	private int stars;
	@Reference 
	private List<Person> buyers;
	public Article(){
		
	}
	
	public Article( String name, int stars, List buyers) {
		super();
		this.name = name;
		this.stars = stars;
		this.setBuyers(buyers);
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	
	public List<Person> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<Person> buyers) {
		this.buyers = buyers;
	}
	
	
}
