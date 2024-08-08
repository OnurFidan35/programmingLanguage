package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.concretes.Services;
import kodlama.io.programmingLanguage.entities.concretes.Technology;

public interface ITechnologyService {

	public Services<List<Technology>> findAll();
	public Services <Void> add(Technology technology);
	public Services <Void> delete(int id);
	public Services <Void> update(Technology technology);
	
	
}
