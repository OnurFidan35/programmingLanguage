package kodlama.io.programmingLanguage.restfulApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.ITechnologyService;
import kodlama.io.programmingLanguage.business.concretes.Services;
import kodlama.io.programmingLanguage.entities.concretes.Technology;

@RestController
@RequestMapping("api/technologies")
public class technologyController {
	ITechnologyService technologyService;
	@Autowired
	public technologyController(ITechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public Services<List<Technology>> getAll() {

		return technologyService.findAll();
	}

	@PostMapping("/add")
	public Services<Void> add(@RequestBody Technology technology) {

		return technologyService.add(technology);

	}

	@PostMapping("/delete/{id}")
	public Services<Void> delete(@PathVariable int id) {

		return technologyService.delete(id);

	}

	@PostMapping("/update")
	public Services<Void> update(@RequestBody Technology technology) {

		return technologyService.update(technology);

	}
	
	
	
	
}
