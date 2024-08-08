package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.concretes.Services;
import kodlama.io.programmingLanguage.entities.concretes.Language;

public interface ILanguageService {
	
	public Services<List<Language >> findAll();
	public Services <Void> add(Language language);
	public Services <Void> delete(int id);
	public Services <Void> update(Language language);
	

}
