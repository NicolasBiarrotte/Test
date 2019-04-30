package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Epreuve;

public interface IEpreuveDAO extends JpaRepository<Epreuve, Long>{

}
