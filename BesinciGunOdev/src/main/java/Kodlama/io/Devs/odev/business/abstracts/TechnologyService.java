package Kodlama.io.Devs.odev.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.odev.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.odev.business.responses.GetAllTechnologyResponse;

public interface TechnologyService {
	
	List<GetAllTechnologyResponse> getAll();

	GetAllTechnologyResponse getById(int id) throws Exception;

	void Add(CreateTechnologyRequest createTechnologyRequest)throws Exception;

	void Update(GetAllTechnologyResponse getAllTechnologyResponse)throws Exception;

	void Delete(GetAllTechnologyResponse getAllTechnologyResponse)throws Exception;
	
}

