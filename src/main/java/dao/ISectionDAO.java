package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Section;

public interface ISectionDAO extends JpaRepository<Section, Long>{

}
