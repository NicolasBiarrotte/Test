package entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Eleve implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private Date datenaissance;
	
	@ManyToOne
	private Section section;
	
	@ManyToMany
	private List<Epreuve> epreuves;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}	
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}
	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}
	
	public Eleve() {}
	public Eleve(String nom, String prenom, Date datenaissance) {
		this.nom = nom;
		this.prenom=prenom;
		this.datenaissance = datenaissance;
	}
	
	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
