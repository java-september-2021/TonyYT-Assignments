package com.TonyYTan.Overflow.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.Overflow.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository <Question, Long>{
	List<Question> findAll(); //list all the question
	
}
