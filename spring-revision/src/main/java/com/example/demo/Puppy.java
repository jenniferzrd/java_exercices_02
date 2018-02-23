package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Puppy {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

// L'id se génere tout seul automatiquement

private String name;
public Boolean getVaccinated() {
	return vaccinated;
}

public void setVaccinated(Boolean vaccinated) {
	this.vaccinated = vaccinated;
}

private String breed;
private String picture;
private Boolean vaccinated;

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public String getPicture() {
	return picture;
}

public void setPicture(String picture) {
	this.picture = picture;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



}
