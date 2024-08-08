package kodlama.io.programmingLanguage.restfulApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.ILanguageService;
import kodlama.io.programmingLanguage.business.concretes.Services;
import kodlama.io.programmingLanguage.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class languageController {

	ILanguageService languageService;
	@Autowired
	public languageController(ILanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getall")
	public Services<List<Language>> getAll() {

		return languageService.findAll();
	}

	@PostMapping("/add")
	public Services<Void> add(@RequestBody Language language) {

		return languageService.add(language);

	}

	@PostMapping("/delete/{id}")
	public Services<Void> delete(@PathVariable int id) {

		return languageService.delete(id);

	}

	@PostMapping("/update")
	public Services<Void> update(@RequestBody Language language) {

		return languageService.update(language);

	}

}
