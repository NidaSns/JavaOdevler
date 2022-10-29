package Kodlama.io.Devs.odev.webApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.odev.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.odev.entities.conctretes.ProgrammingLanguage;

@RestController //annotation
@RequestMapping("/api/programmingLanguage") //adresleme

// restful yapılar için controller
public class ProgrammingLanguageController {
	
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void Add(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		languageService.Add(programmingLanguage);
	}

	@PutMapping("/update")
	public void Update(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		languageService.Update(programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void Delete(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		languageService.Delete(programmingLanguage);
	}

	@GetMapping("/getId")
	public ProgrammingLanguage getId(int id) throws Exception {
		// TODO Auto-generated method stub
		return languageService.getId(id);
	}
}
