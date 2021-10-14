package com.TonyYTan.languages.service;

import org.springframework.stereotype.Service;

import com.TonyYTan.languages.Repository.LangRepository;

@Service
public class LangService {
	private final LangRepository LangRepo;

	//dependency injection: constructor
	public LangService(LangRepository langRepo) {
		this.LangRepo = langRepo;
	}
	
	
}
