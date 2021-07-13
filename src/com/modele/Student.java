package com.modele;

public class Student {
	private int id;
	private String name;
	private String firstname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Nom=" + name + ", Prenom=" + firstname + "]";
	}	
}
