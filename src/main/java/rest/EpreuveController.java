package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Epreuve;
import metier.IEpreuveService;

@RestController
public class EpreuveController {
	
	
	@Autowired
	private IEpreuveService epreuveDao;
	
	@GetMapping("/api/get/{id}")
	public Epreuve getOne(@PathVariable Long id) {
		return epreuveDao.getOne(id);
	}

	@PostMapping("/api/save")
	public Epreuve save(@RequestBody Epreuve p) {
		return epreuveDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Epreuve p) {
		epreuveDao.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Epreuve> findAll() {
		return epreuveDao.findAll();
	}

}
