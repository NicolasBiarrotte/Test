package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Matiere;
import metier.IMatiereService;

@RestController
public class MatiereController {
	
	
	@Autowired
	private IMatiereService matiereDao;
	
	@GetMapping("/api/get/{id}")
	public Matiere getOne(@PathVariable Long id) {
		return matiereDao.getOne(id);
	}

	@PostMapping("/api/save")
	public Matiere save(@RequestBody Matiere p) {
		return matiereDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Matiere p) {
		matiereDao.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Matiere> findAll() {
		return matiereDao.findAll();
	}

}
