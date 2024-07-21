package Beans;

import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;

@NamedEvent
@RequestScoped

public class FormBean {
	
	private String nom;
	private String prenom;
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
	
	
}
