package com.TonyYTan.Overflow.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TonyYTan.Overflow.Repository.AnswerRepository;
import com.TonyYTan.Overflow.Repository.QuestionRepository;
import com.TonyYTan.Overflow.Repository.TagRepository;
import com.TonyYTan.Overflow.models.Answer;
import com.TonyYTan.Overflow.models.Question;
import com.TonyYTan.Overflow.models.Tag;

@Service
public class MainService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	
	
	//list all the question
	public List<Question> findAllQuestion(){
		return this.qRepo.findAll();
	}
	
	//find a question 
	public Question findQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	//create a question
	public Question createQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	//delete a question
	public void deleteQuestion(Long id) {
		this.qRepo.deleteById(id);
	}
	


	//list all the answer
	public List<Answer> findAllAnswer(){
		return this.aRepo.findAll();
	}
	
	//find a answer 
	public Answer findAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	//create an answer
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	
	//delete a answer
	public void deleteAnswer(Long id) {
		this.aRepo.deleteById(id);
	}
	
	
	
	//list all the tag
	public List<Tag> findAllTag(){
		return this.tRepo.findAll();
	}
	
	//find a tag 
	public Tag findTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	//create a tag
	public Tag createTag(Tag tag) {
		return this.tRepo.save(tag);
	}
	
	//delete a tag
	public void deleteTag(Long id) {
		this.tRepo.deleteById(id);
	}
	
	
	
	//add this answer to this question
	public Question addAnswerToThisQuestion(Answer answer, Long questionId){
		Question thisQuestion = this.qRepo.findById(questionId).orElse(null);
		System.out.println(thisQuestion.getName());
		thisQuestion.getAnswers().add(answer);
//		System.out.println(thisQuestion.getAnswers());
		return this.qRepo.save(thisQuestion);
//		System.out.println(thisQuestion.getAnswers());
	}


}
