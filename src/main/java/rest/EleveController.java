package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Eleve;
import entities.Epreuve;
import metier.IEleveService;

@RestController
public class EleveController {
	
	
	@Autowired
	private IEleveService eleveDao;
	
	@GetMapping("/api/get/{id}")
	public Eleve getOne(@PathVariable Long id) {
		return eleveDao.getOne(id);
	}

	@PostMapping("/api/save")
	public Eleve save(@RequestBody Eleve p) {
		return eleveDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Eleve p) {
		eleveDao.delete(p);
	}

	@GetMapping("/api/findall")
	public List<Eleve> findAll() {
		return eleveDao.findAll();
	}
	
	@GetMapping("/api/printconvocation")
	public String printConvocation(@RequestBody Eleve p, @RequestBody Epreuve e) {
		return eleveDao.ImprimerConvocation(p, e);
	}

}
