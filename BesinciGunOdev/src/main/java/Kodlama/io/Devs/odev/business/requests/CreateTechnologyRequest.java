package Kodlama.io.Devs.odev.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTechnologyRequest {

	private String name;
	
	private int programmingLanguageId;
}
