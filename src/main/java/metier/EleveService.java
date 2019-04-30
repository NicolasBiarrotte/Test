package metier;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dao.IEleveDAO;
import entities.Eleve;
import entities.Epreuve;

@Service
public class EleveService implements IEleveService{

	private IEleveDAO dao;
	
	public IEleveDAO getDao() {
		return dao;
	}

	public void setDao(IEleveDAO dao) {
		this.dao = dao;
	}	
	
	
	@Override
	public List<Eleve> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Eleve> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(sort);
	}

	@Override
	public List<Eleve> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return dao.findAllById(ids);
	}

	@Override
	public <S extends Eleve> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return dao.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		dao.flush();
	}

	@Override
	public <S extends Eleve> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Eleve> entities) {
		// TODO Auto-generated method stub
		dao.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		dao.deleteAllInBatch();
	}

	@Override
	public Eleve getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public <S extends Eleve> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findAll(example);
	}

	@Override
	public <S extends Eleve> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(example, sort);
	}

	@Override
	public Page<Eleve> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

	@Override
	public <S extends Eleve> S save(S entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Optional<Eleve> findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public void delete(Eleve entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Eleve> entities) {
		// TODO Auto-generated method stub
		dao.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}

	@Override
	public <S extends Eleve> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findOne(example);
	}

	@Override
	public <S extends Eleve> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(example, pageable);
	}

	@Override
	public <S extends Eleve> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.count(example);
	}

	@Override
	public <S extends Eleve> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.exists(example);
	}

	@Override
	public String ImprimerConvocation(Eleve eleve, Epreuve epreuve) {
		// TODO Auto-generated method stub
		
		return eleve.getPrenom() + " " + eleve.getNom() + " n° Etudiant " + eleve.getId() + " est convoqué(e) à l'épreuve " + epreuve.getId()+ 
				" de " + epreuve.getMatiere().getLibelle() + "(coefficient " +epreuve.getMatiere().getCoefficient() + ") ayant lieu le " + 
				epreuve.getDateepreuve() + " pour une durée de " + epreuve.getMatiere().getDuree() + "h." + " dans la salle " + 
				epreuve.getLaboratoire().getId() + " " + epreuve.getLaboratoire().getNom();
	}

	

}
