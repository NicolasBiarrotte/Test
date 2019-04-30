package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Laboratoire;
import metier.ILaboratoireService;

@RestController
public class LaboratoireController {
	
	
	@Autowired
	private ILaboratoireService laboratoireDao;
	
	@GetMapping("/api/get/{id}")
	public Laboratoire getOne(@PathVariable Long id) {
		return laboratoireDao.getOne(id);
	}

	@PostMapping("/api/save")
	public Laboratoire save(@RequestBody Laboratoire p) {
		return laboratoireDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Laboratoire p) {
		laboratoireDao.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Laboratoire> findAll() {
		return laboratoireDao.findAll();
	}

}
