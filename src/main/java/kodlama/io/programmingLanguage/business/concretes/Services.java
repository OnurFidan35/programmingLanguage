package kodlama.io.programmingLanguage.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Services  <T>{
	
	public Services(T data) {
		
		this.data=data;
		
	}
	
	
	private T data;
	private boolean succesful=true;
	private String errorMessage;

}
