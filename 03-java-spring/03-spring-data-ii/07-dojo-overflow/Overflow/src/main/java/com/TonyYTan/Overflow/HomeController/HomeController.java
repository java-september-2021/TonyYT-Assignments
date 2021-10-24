package com.TonyYTan.Overflow.HomeController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.TonyYTan.Overflow.Service.MainService;
import com.TonyYTan.Overflow.models.Answer;
import com.TonyYTan.Overflow.models.Question;

@Controller
public class HomeController {
	@Autowired
	private MainService mSer;
	
	//go to the dashboard page
	@GetMapping("/")
	public String index(@ModelAttribute("question") Question question, Model model) {
		model.addAttribute("questions", this.mSer.findAllQuestion());
		return "index.jsp";
	}
	
	//go to the new question page
	@GetMapping("/question/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "newquestion.jsp";
	}
	
	@PostMapping("/addnewquestion")
	public String addnewquestion(@Valid @ModelAttribute ("question") Question questoin, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("error");
			return "newquestion.jsp";
		}
		System.out.println("pass");
		this.mSer.createQuestion(questoin);
		return "redirect:/";
	}
	
	
	@GetMapping("/question/{id}")
	public String addAnswer(@ModelAttribute("answer") Answer answer, @PathVariable("id") Long id, Model model) {
		Question thisQuestion = this.mSer.findQuestion(id);
		model.addAttribute("thisQuestion", thisQuestion);
		model.addAttribute("answersToThisQuestion",thisQuestion.getAnswers());
		return "newanswer.jsp";
	}
	
	
	@PostMapping("/addanswer/{id}")
	public String addNewAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			System.out.println("Errors here, did not go through");
			return "newanswer.jsp";
		}
		System.out.println("the answer has bee added");
		this.mSer.createAnswer(answer);
//		this.mSer.addAnswerToThisQuestion(answer, id);
		return "redirect:/question/{id}";
	}
}
