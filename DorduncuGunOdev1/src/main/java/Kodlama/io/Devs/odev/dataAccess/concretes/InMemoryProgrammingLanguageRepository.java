package Kodlama.io.Devs.odev.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.odev.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

@Repository  // bu sınıf bir DataAccess nesnesidir
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages =  new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Phyton"));
		programmingLanguages.add(new ProgrammingLanguage(3,"C"));
		programmingLanguages.add(new ProgrammingLanguage(4,"C++"));
		programmingLanguages.add(new ProgrammingLanguage(5,"Dart"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getId(int id) throws Exception {
		for(ProgrammingLanguage language:programmingLanguages) {
			if(language.getId()==id)
			{
				return language;
			}
		}
		throw new Exception("Bu id'de bir dil bulunamamıştır");
	}

	@Override
	public void Add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		for (ProgrammingLanguage language : programmingLanguages) {
			if(programmingLanguage.getName().equals(language.getName())) {
				break;
			}
		}
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void Update(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		int index = programmingLanguages.indexOf(getId(programmingLanguage.getId()));
		programmingLanguages.set(index,programmingLanguage);
	}

	@Override
	public void Delete(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		int index = programmingLanguages.indexOf(getId(programmingLanguage.getId()));
		programmingLanguages.remove(index);
	}

}
