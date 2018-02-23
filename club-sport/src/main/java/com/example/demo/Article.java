package com.example.demo;
import java.util.Date;

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
private String desc;
private String img;
private Date date;
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}



}
