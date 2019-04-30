package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Section;
import metier.ISectionService;

@RestController
public class SectionController {
	
	
	@Autowired
	private ISectionService sectionDao;
	
	@GetMapping("/api/get/{id}")
	public Section getOne(@PathVariable Long id) {
		return sectionDao.getOne(id);
	}

	@PostMapping("/api/save")
	public Section save(@RequestBody Section p) {
		return sectionDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Section p) {
		sectionDao.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Section> findAll() {
		return sectionDao.findAll();
	}

}
