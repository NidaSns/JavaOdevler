package Kodlama.io.Devs.odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.odev.business.abstracts.TechnologyService;
import Kodlama.io.Devs.odev.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.odev.business.responses.GetAllTechnologyResponse;
import Kodlama.io.Devs.odev.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.odev.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;
import Kodlama.io.Devs.odev.entities.conctretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository languageRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository repository,ProgrammingLanguageRepository languageRepository) {
		technologyRepository=repository;
		this.languageRepository=languageRepository;
				
		
	}
	
	@Override
	public void Add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		// TODO Auto-generated method stub
		Technology technology = new Technology();
		ProgrammingLanguage language = new ProgrammingLanguage();
		technology.setName(createTechnologyRequest.getName());
		var langguageID = languageRepository.findById(createTechnologyRequest.getProgrammingLanguageId()).get();
		language.setId(langguageID.getId());
		language.setName(langguageID.getName());
		technology.setProgrammingLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void Update(GetAllTechnologyResponse getAllTechnologyResponse) throws Exception {
		// TODO Auto-generated method stub
		Technology technology = new Technology();
		ProgrammingLanguage language = new ProgrammingLanguage();
		var langguageID = languageRepository.findById(getAllTechnologyResponse.getProgrammingLanguageId()).get();
		technology.setName(getAllTechnologyResponse.getName());
		technology.setId(getAllTechnologyResponse.getId());
		language.setId(langguageID.getId());
		language.setName(langguageID.getName());
		technology.setProgrammingLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public void Delete(GetAllTechnologyResponse getAllTechnologyResponse) throws Exception {
		// TODO Auto-generated method stub
		Technology technology = new Technology(); 
		ProgrammingLanguage language = new ProgrammingLanguage();
		var languageID = languageRepository.findById(getAllTechnologyResponse.getProgrammingLanguageId()).get();
		language.setId(languageID.getId());
		language.setName(languageID.getName());
		technology.setId(getAllTechnologyResponse.getId());
		technology.setName(getAllTechnologyResponse.getName());
		technology.setProgrammingLanguage(language);
		technologyRepository.delete(technology);
	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		// TODO Auto-generated method stub
		List<GetAllTechnologyResponse> allProgrammingLangResponses = new ArrayList<>();
		List<Technology> technologies = technologyRepository.findAll();
		
		for (Technology technology : technologies) {
			GetAllTechnologyResponse getAllProgrammingLangResponse = new GetAllTechnologyResponse();
			getAllProgrammingLangResponse.setId(technology.getId());
			getAllProgrammingLangResponse.setName(technology.getName());
			getAllProgrammingLangResponse.setProgrammingLanguageId(technology.getProgrammingLanguage().getId());
			allProgrammingLangResponses.add(getAllProgrammingLangResponse);
		}
		return allProgrammingLangResponses;
	}

	@Override
	public GetAllTechnologyResponse getById(int id) throws Exception {
		// TODO Auto-generated method stub
		Technology technology = technologyRepository.findById(id).get();
		GetAllTechnologyResponse allProgrammingLangResponse = new GetAllTechnologyResponse();
		allProgrammingLangResponse.setId(technology.getId());
		allProgrammingLangResponse.setName(technology.getName());
		allProgrammingLangResponse.setProgrammingLanguageId(technology.getProgrammingLanguage().getId());
		return allProgrammingLangResponse;
	}
	
}
