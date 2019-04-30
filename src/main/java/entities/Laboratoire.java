package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Laboratoire  implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private int nbordinateurs;
	
	@OneToMany(mappedBy="laboratoire")
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

	public int getNbordinateurs() {
		return nbordinateurs;
	}

	public void setNbordinateurs(int nbordinateurs) {
		this.nbordinateurs = nbordinateurs;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	public Laboratoire() {}
	public Laboratoire(Long id, String nom, int nbordinateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.nbordinateurs = nbordinateurs;
	}

	@Override
	public String toString() {
		return "Laboratoire [id=" + id + ", nom=" + nom + ", nbordinateurs=" + nbordinateurs + "]";
	}

	
	
}
