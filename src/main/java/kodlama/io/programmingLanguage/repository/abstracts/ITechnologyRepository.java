package kodlama.io.programmingLanguage.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.concretes.Technology;

public interface ITechnologyRepository extends JpaRepository<Technology, Integer>{

}
