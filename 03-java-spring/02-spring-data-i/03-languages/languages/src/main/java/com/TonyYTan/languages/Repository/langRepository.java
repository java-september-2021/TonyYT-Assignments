package com.TonyYTan.languages.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonYTan.languages.model.Language;

@Repository
public interface LangRepository extends CrudRepository<Language, Long>{
	
}
