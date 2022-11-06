package Kodlama.io.Devs.odev.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTechnologyResponse {
	int id;
	String Name;
	int programmingLanguageId;
}
