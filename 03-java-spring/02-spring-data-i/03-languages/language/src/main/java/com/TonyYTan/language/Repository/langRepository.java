package com.TonyYTan.language.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.language.models.Language;

@Repository
public interface langRepository extends CrudRepository<Language, Long> {
	List<Language> findAll(); // select * from langs
}
