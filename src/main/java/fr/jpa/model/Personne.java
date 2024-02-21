package fr.jpa.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private boolean estVrai;
		
	public Personne() {
		super();
	} 

	public Personne(Long id, String nom, String prenom, boolean estVrai) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.estVrai = estVrai;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public boolean getEstVrai() {
		return this.estVrai;
	}

	public void setEstVrai(boolean estVrai) {
		this.estVrai = estVrai;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", estVrai=" + estVrai + "]";
	}
   
}
