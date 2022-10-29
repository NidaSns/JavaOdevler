package Kodlama.io.Devs.odev.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.odev.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.odev.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

@Service  //Bu sınıf bir business nesnesidir
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}

	@Override
	public void Add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		languageRepository.Add(programmingLanguage);
	}

	@Override
	public void Update(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		languageRepository.Update(programmingLanguage);
	}

	@Override
	public void Delete(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		languageRepository.Delete(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage getId(int id) throws Exception {
		// TODO Auto-generated method stub
		return languageRepository.getId(id);
	}
}
