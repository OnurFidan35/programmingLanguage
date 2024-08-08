package kodlama.io.programmingLanguage.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name="language")
@Entity
public class Language {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private int id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "language",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Technology>  technologies;
	

}
