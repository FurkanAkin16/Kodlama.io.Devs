package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesControllers {
	private LanguageService languageService;

	@Autowired
	public LanguagesControllers(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();
	}
}
