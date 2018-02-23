package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Granny {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	private String name;
	private String description;
	private String img;
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
}

	
	public void setImg (String img) {
		this.img = img;
	}
	
	public String getImg () {
		return img;
}
	
	
	public void setDescription (String description) {
		this.description = description;
	}
	
	public String getDescription () {
		return description;
}
}

