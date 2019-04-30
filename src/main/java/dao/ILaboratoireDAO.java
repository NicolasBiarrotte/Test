package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Laboratoire;

public interface ILaboratoireDAO extends JpaRepository<Laboratoire, Long> {

}
