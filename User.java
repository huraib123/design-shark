package com.rasool.design.shark.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
 private int id;
	 @Column(nullable = false)
	private String password;
 public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 @Column(nullable = false, unique = true)
private String username;
	 
 private String name;
 private String email;
 @ElementCollection(fetch = FetchType.EAGER)
 @Column(name = "role")
 private List<String> roles;


 
 
}
