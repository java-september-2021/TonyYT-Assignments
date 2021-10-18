package com.TonyYTan.DojoNinjas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TonyYTan.DojoNinjas.Repository.DojoRepository;
import com.TonyYTan.DojoNinjas.Repository.NinjaRepository;
import com.TonyYTan.DojoNinjas.models.Dojo;
import com.TonyYTan.DojoNinjas.models.Ninja;

@Service
public class DjService {
	private NinjaRepository nRepo;
	@Autowired 
	private DojoRepository dRepo;
	
//	private final NinjaRepo nRepo;
//	private final DojoRepo dRepo;
//	public DjService(NinjaRepo nRepo, DojoRepo dRepo) {
//		this.dRepo = dRepo;
//		this.nRepo = nRepo;
//	}
	
	//list all Dojo
	public List<Dojo> findAllDojos(){
		return this.dRepo.findAll();
	}
	
	
	//create a new Dojo
	public Dojo newDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//find a Dojo
	public Dojo findDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	
	
	
	//list all Ninja
	public List<Ninja> findAllNinjas(){
		return this.nRepo.findAll();
	}
	
	//find an Ninja
	public Ninja findNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
}
