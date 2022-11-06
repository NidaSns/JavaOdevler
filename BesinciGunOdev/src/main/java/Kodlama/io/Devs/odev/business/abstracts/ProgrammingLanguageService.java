package Kodlama.io.Devs.odev.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.odev.business.requests.CreateLanguageProgrammingRequest;
import Kodlama.io.Devs.odev.business.responses.GetAllProgrammingLangResponse;

public interface ProgrammingLanguageService {
	
	
	List<GetAllProgrammingLangResponse> getAll();
	
	void Add(CreateLanguageProgrammingRequest createLanguageProgrammingRequest) throws Exception;
	
	void Update(GetAllProgrammingLangResponse allProgrammingLangResponse,String name) throws Exception;
	
	void Delete(GetAllProgrammingLangResponse allProgrammingLangResponse) throws Exception;
	
	GetAllProgrammingLangResponse getId(int id)  throws Exception;

}
