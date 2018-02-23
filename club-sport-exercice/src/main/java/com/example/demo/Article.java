package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;


private String titre;
private String photo;

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}


public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}



}
