package kodlama.io.programmingLanguage.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.business.abstracts.ITechnologyService;
import kodlama.io.programmingLanguage.entities.concretes.Technology;
import kodlama.io.programmingLanguage.repository.abstracts.ITechnologyRepository;
@Service
public class TechnologyManager implements ITechnologyService{

	ITechnologyRepository repository;
	
	public TechnologyManager(ITechnologyRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Services<List<Technology>> findAll() {
		Services<List<Technology>> result=new Services<List<Technology>>();
		result.setData((List <Technology>)repository.findAll());
		return result; 
	}

	@Override
	public Services<Void> add(Technology technology) {
		Services<Void> services = new Services<Void>();
		repository.save(technology);
		return services;
	}

	@Override
	public Services<Void> delete(int id) {
		Services<Void> services = new Services<Void>();
		repository.deleteById(id);
		return services;
	}

	@Override
	public Services<Void> update(Technology technology) {
		Services<Void> services = new Services<Void>();
		repository.save(technology);
		return services;
	}

}
