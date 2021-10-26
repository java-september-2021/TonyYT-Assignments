package com.TonyYTan.Admin.HomeController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.TonyYTan.Admin.Service.UserService;
import com.TonyYTan.Admin.models.User;
import com.TonyYTan.Admin.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService uSer;
	@Autowired
	private UserValidator uVal;

	
	@GetMapping("/")
	public String index(@ModelAttribute ("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/registerUser")
	public String register(@Valid @ModelAttribute ("user") User user, BindingResult result, HttpSession session) {
		uVal.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.uSer.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("user__id") == null) {
			return "redirect:/";
		}
		model.addAttribute("user",this.uSer.getOneUser((Long)session.getAttribute("user__id")));
		return "dashboard.jsp";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttr) {
		if(!this.uSer.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User userToBeLoggedIn = this.uSer.getUserByEmail(email);
		session.setAttribute("user__id", userToBeLoggedIn.getId());
		return "redirect:/dashboard";
	}
	
	
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
