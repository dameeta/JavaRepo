import java.io.Serializable;

public class Country implements Serializable {  
	  
	 String name;  
	 transient long population;  
	   
	 
	 public Country() {
	 super();
	}
	public Country(String name, long population) {  
	  super();  
	  this.name = name;  
	  this.population = population;  
	 }  
	 public String getName() {  
	  return name;  
	 }  
	 public void setName(String name) {  
	  this.name = name;  
	 }  
	 public long getPopulation() {  
	  return population;  
	 }  
	 public void setPopulation(long population) {  
	  this.population = population;  
	 }
	    
	}  
