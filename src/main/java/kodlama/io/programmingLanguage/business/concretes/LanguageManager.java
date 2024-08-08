package kodlama.io.programmingLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.business.abstracts.ILanguageService;
import kodlama.io.programmingLanguage.entities.concretes.Language;
import kodlama.io.programmingLanguage.repository.abstracts.ILanguageRepository;

@Service
public class LanguageManager implements ILanguageService{

	ILanguageRepository repository;
	
	
	
	@Autowired
	public LanguageManager(ILanguageRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Services <List <Language> > findAll() {
		
		Services<List<Language>> result=new Services<List<Language>>();
		result.setData((List <Language>)repository.findAll());
		
		return result;
	}

	@Override
	public Services<Void> add(Language language) {
	Services<Void> services = new Services<Void>();
    repository.save(language);
	return services;
	}

	@Override
	public Services<Void> delete(int id) {
		Services<Void> services = new Services<Void>();
	    repository.deleteById(id);
		return services;
	}

	@Override
	public Services<Void> update(Language language) {
		Services<Void> services = new Services<Void>();
		
	    repository.save(language);
		return services;
	}					

}
