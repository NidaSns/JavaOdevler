package Kodlama.io.Devs.odev.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getId(int id) throws Exception;

	void Add(ProgrammingLanguage programmingLanguage);
	
	void Update(ProgrammingLanguage programmingLanguage) throws Exception;
	
	void Delete(ProgrammingLanguage programmingLanguage) throws Exception;
}
