package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere  implements Serializable{
	
	@Id @GeneratedValue
	private int id;

	private String libelle;
	private float duree;
	private int coefficient;
	
	@ManyToOne
	private Section sectionmat;
	
	@OneToMany(mappedBy="matiere")
	private List<Epreuve> epreuves;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public Section getSection() {
		return sectionmat;
	}

	public void setSection(Section sectionmat) {
		this.sectionmat = sectionmat;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	public Matiere() {}
	public Matiere(int id, String libelle, float duree, int coefficient) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", libelle=" + libelle + ", duree=" + duree + ", coefficient=" + coefficient + "]";
	}

	
	
}
