package com.TonyYTan.languages.service;

import org.springframework.stereotype.Service;

import com.TonyYTan.languages.Repository.langRepository;

@Service
public class langService {
	private final langRepository lRepo;

	public langService(langRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	
}
