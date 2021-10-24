package com.TonyYTan.Overflow.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.Overflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long>{
	List<Answer> findAll(); // list all the answers
}
