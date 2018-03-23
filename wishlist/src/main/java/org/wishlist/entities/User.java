package org.wishlist.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
    private Long id;
    private String fname;
    private String lname;
    private int emoney;
    private String email;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEmoney() {
		return emoney;
	}
	public void setEmoney(int emoney) {
		this.emoney = emoney;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(String fname, String lname, int emoney, String email) {
		this.fname = fname;
		this.lname = lname;
		this.emoney = emoney;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", emoney=" + emoney + "]";
	}
	public User() {
}
}
