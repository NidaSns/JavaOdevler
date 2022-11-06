package Kodlama.io.Devs.odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.odev.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.odev.business.requests.CreateLanguageProgrammingRequest;
import Kodlama.io.Devs.odev.business.responses.GetAllProgrammingLangResponse;
import Kodlama.io.Devs.odev.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

@Service  //Bu sınıf bir business nesnesidir
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllProgrammingLangResponse> getAll() {
		// iş kuralları
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllProgrammingLangResponse> getAllProgrammingLangResponses = new ArrayList<>();
	
		for (ProgrammingLanguage programmingLanguage : languages) {
			GetAllProgrammingLangResponse allProgrammingLangResponse = new GetAllProgrammingLangResponse();
			allProgrammingLangResponse.setId(programmingLanguage.getId());
			allProgrammingLangResponse.setName(programmingLanguage.getName());
			getAllProgrammingLangResponses.add(allProgrammingLangResponse);
		}
		return getAllProgrammingLangResponses;
	}

	@Override
	public void Add(CreateLanguageProgrammingRequest createLanguageProgrammingRequest) {
		// TODO Auto-generated method stub
		
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(createLanguageProgrammingRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void Update(GetAllProgrammingLangResponse getAllProgrammingLangResponse,String name) throws Exception {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(name);
		language.setId(getAllProgrammingLangResponse.getId());
		languageRepository.save(language);

	}

	@Override
	public void Delete(GetAllProgrammingLangResponse getAllProgrammingLangResponse) throws Exception {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(getAllProgrammingLangResponse.getId());
		languageRepository.delete(language);
	}

	@Override
	public GetAllProgrammingLangResponse getId(int id) throws Exception {
		// TODO Auto-generated method stub
		ProgrammingLanguage programmingLanguage = languageRepository.findById(id).get();
		GetAllProgrammingLangResponse getAllProgrammingLangResponse = new GetAllProgrammingLangResponse();
		getAllProgrammingLangResponse.setName(programmingLanguage.getName());
		getAllProgrammingLangResponse.setId(programmingLanguage.getId());
		return getAllProgrammingLangResponse;
		
	}
}
