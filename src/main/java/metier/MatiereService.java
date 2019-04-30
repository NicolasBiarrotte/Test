package metier;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dao.IMatiereDAO;
import entities.Matiere;

@Service
public class MatiereService implements IMatiereService{

	private IMatiereDAO dao;
	
	public IMatiereDAO getDao() {
		return dao;
	}

	public void setDao(IMatiereDAO dao) {
		this.dao = dao;
	}	
	
	
	@Override
	public List<Matiere> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Matiere> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(sort);
	}

	@Override
	public List<Matiere> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return dao.findAllById(ids);
	}

	@Override
	public <S extends Matiere> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return dao.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		dao.flush();
	}

	@Override
	public <S extends Matiere> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Matiere> entities) {
		// TODO Auto-generated method stub
		dao.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		dao.deleteAllInBatch();
	}

	@Override
	public Matiere getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public <S extends Matiere> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findAll(example);
	}

	@Override
	public <S extends Matiere> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(example, sort);
	}

	@Override
	public Page<Matiere> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

	@Override
	public <S extends Matiere> S save(S entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Optional<Matiere> findById(Long id) {
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
	public void delete(Matiere entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Matiere> entities) {
		// TODO Auto-generated method stub
		dao.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}

	@Override
	public <S extends Matiere> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findOne(example);
	}

	@Override
	public <S extends Matiere> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(example, pageable);
	}

	@Override
	public <S extends Matiere> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.count(example);
	}

	@Override
	public <S extends Matiere> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.exists(example);
	}

	

}
