package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Matiere;

public interface IMatiereDAO extends JpaRepository<Matiere, Long>{

}
