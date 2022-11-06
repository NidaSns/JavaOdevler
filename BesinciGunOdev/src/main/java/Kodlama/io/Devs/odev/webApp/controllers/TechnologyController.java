package Kodlama.io.Devs.odev.webApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.odev.business.abstracts.TechnologyService;
import Kodlama.io.Devs.odev.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.odev.business.responses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technology")
public class TechnologyController {

	private TechnologyService service;

	@Autowired
	public TechnologyController(TechnologyService serviceTechnology) {
		service = serviceTechnology;
	}
	
	@GetMapping("/getAll")
	public List<GetAllTechnologyResponse> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/add")
	public void Add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		// TODO Auto-generated method stub
		service.Add(createTechnologyRequest);
	}

	@PutMapping("/update")
	public void Update(GetAllTechnologyResponse getAllTechnologyResponse) throws Exception {
		// TODO Auto-generated method stub
		service.Update(getAllTechnologyResponse);
	}

	@DeleteMapping("/delete")
	public void Delete(GetAllTechnologyResponse getAllTechnologyResponse) throws Exception {
		// TODO Auto-generated method stub
		service.Delete(getAllTechnologyResponse);
	}

	@GetMapping("/getId")
	public GetAllTechnologyResponse getId(int id) throws Exception {
		// TODO Auto-generated method stub
		return service.getById(id);
	}
	
}
