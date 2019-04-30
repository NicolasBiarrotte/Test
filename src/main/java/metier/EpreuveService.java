package metier;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dao.IEpreuveDAO;
import entities.Epreuve;

@Service
public class EpreuveService implements IEpreuveService{

	private IEpreuveDAO dao;
	
	public IEpreuveDAO getDao() {
		return dao;
	}

	public void setDao(IEpreuveDAO dao) {
		this.dao = dao;
	}	
	
	
	@Override
	public List<Epreuve> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Epreuve> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(sort);
	}

	@Override
	public List<Epreuve> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return dao.findAllById(ids);
	}

	@Override
	public <S extends Epreuve> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return dao.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		dao.flush();
	}

	@Override
	public <S extends Epreuve> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Epreuve> entities) {
		// TODO Auto-generated method stub
		dao.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		dao.deleteAllInBatch();
	}

	@Override
	public Epreuve getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public <S extends Epreuve> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findAll(example);
	}

	@Override
	public <S extends Epreuve> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(example, sort);
	}

	@Override
	public Page<Epreuve> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

	@Override
	public <S extends Epreuve> S save(S entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Optional<Epreuve> findById(Long id) {
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
	public void delete(Epreuve entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Epreuve> entities) {
		// TODO Auto-generated method stub
		dao.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}

	@Override
	public <S extends Epreuve> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findOne(example);
	}

	@Override
	public <S extends Epreuve> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(example, pageable);
	}

	@Override
	public <S extends Epreuve> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.count(example);
	}

	@Override
	public <S extends Epreuve> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.exists(example);
	}

	

}
