package TP_SIR_mongodb.TP_SIR_mongodb;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class Main {
	
	public static void main( String[] args ) throws UnknownHostException
	{
	    Morphia morphia = new Morphia();    
	    Mongo mongo = new Mongo();
	    morphia.map(Person.class).map(Address.class);
	    Datastore ds = morphia.createDatastore(mongo, "my_database");
	    

	   Address address = new Address();
	    address.setStreet("123 Some street");
	    address.setCity("Some city");
	    address.setPostCode("123 456");
	    address.setCountry("Some country");
	    //set address
	    ds.save(address);
	    Person p = new Person();
	    p.setName("TintinV2");
	   List<Address> address0 = new ArrayList<Address>();
	   address0.add(address);   
	  // ds.save(address0);
	   p.setAddress0(address0);
	    // Save the POJo
	    ds.save(p);
	    //article
	    Article article = new Article();
	    List<Person> buyers=new ArrayList<Person>();
	    buyers.add(p);
	    ds.save(article);
	    
	    for (Person e : ds.find(Person.class))
	         System.err.println(e);

	}
}
