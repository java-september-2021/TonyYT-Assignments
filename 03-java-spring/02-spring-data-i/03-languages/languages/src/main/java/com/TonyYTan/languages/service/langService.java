package com.TonyYTan.languages.service;

import org.springframework.stereotype.Service;

import com.TonYTan.languages.model.Language;
import com.TonyYTan.languages.Repository.LangRepository;

@Service
public class LangService {
	private final LangRepository LangRepo;

	//dependency injection: constructor
	public LangService(LangRepository langRepo) {
		this.LangRepo = langRepo;
	}
	
	//create new langauge
	public Language createLang (Language lang) {
		return this.LangRepo.save(lang);
	}
	
	//update langauage
	public Language updateLang (Long id, String name, String creator, float currentVersion) {
		Language lang = this.LangRepo.findById(id).orElse(null);
		lang.setCreator(creator);
		lang.setName(name);
		lang.setCurrentVersion(currentVersion);
		return this.LangRepo.save(lang);
	}
	
}
