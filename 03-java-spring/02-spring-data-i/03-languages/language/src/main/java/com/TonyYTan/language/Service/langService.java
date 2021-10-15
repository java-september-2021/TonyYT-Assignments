package com.TonyYTan.language.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TonyYTan.language.Repository.langRepository;
import com.TonyYTan.language.models.Language;

@Service
public class langService {
	private final langRepository langRepo;

	public langService(langRepository langRepo) {
		this.langRepo = langRepo;
	}

	// display all language list
	public List<Language> allLanguages() {
		return this.langRepo.findAll();
	}

	// find a language
	public Language find(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}

	// create a new language
	public Language creatLang(String name, String creator, float currentVersion) {
		Language lang = new Language(name, creator, currentVersion);
		return this.langRepo.save(lang);
	}

	// update language
	public Language updateLang(Long id, String name, String creator, float currentVersion) {
		Language lang = this.langRepo.findById(id).orElse(null);
		lang.setCreator(creator);
		lang.setName(name);
		lang.setCurrentVersion(currentVersion);
		return this.langRepo.save(lang);
	}

	// delete language
	public void deleteLang(Long id) {
		Language lang = this.langRepo.findById(id).orElse(null);
		this.langRepo.delete(lang);
	}
}
