package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;


private String name;
private String prenom;
private int age;
private String niveau;
private String photo;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getNiveau() {
	return niveau;
}

public void setNiveau(String niveau) {
	this.niveau = niveau;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}



}
