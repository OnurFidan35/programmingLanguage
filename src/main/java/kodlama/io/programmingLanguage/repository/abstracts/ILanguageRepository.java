package kodlama.io.programmingLanguage.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.concretes.Language;

public interface ILanguageRepository extends JpaRepository<Language, Integer>{

}
