package entities;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Epreuve {
	
	@Id @GeneratedValue
	private Long id;
	
	private Date dateepreuve;
	
	@ManyToMany 
	private List<Eleve> eleves;
	
	@ManyToOne
	private Laboratoire laboratoire;
	
	@ManyToOne
	private Matiere matiere;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateepreuve() {
		return dateepreuve;
	}

	public void setDateepreuve(Date dateepreuve) {
		this.dateepreuve = dateepreuve;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Epreuve() {}
	public Epreuve(Long id, Date dateepreuve) {
		super();
		this.id = id;
		this.dateepreuve = dateepreuve;
	}

	@Override
	public String toString() {
		return "Epreuve [id=" + id + ", dateepreuve=" + dateepreuve + "]";
	}

	
	
}
