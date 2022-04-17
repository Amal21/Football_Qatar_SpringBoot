package isi.tn.entities;

import javax.persistence.Id;

public class User {
	
	private String nom;
	private String prenom;
	
	@Id
	private String cin;
	
	
	
	

	public User(String nom, String prenom, String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getPrenom() {
		return prenom;
	}





	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





	public String getCin() {
		return cin;
	}





	public void setCin(String cin) {
		this.cin = cin;
	}





	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
