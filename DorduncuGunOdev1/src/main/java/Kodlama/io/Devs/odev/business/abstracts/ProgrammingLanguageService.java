package Kodlama.io.Devs.odev.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getId(int id) throws Exception;
	
	void Add(ProgrammingLanguage programmingLanguage)throws Exception;
	
	void Update(ProgrammingLanguage programmingLanguage)throws Exception;
	
	void Delete(ProgrammingLanguage programmingLanguage)throws Exception;
}
