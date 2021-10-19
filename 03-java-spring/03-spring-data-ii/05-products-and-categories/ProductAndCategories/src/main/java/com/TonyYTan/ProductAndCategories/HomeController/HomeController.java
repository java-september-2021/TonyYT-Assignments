package com.TonyYTan.ProductAndCategories.HomeController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.TonyYTan.ProductAndCategories.Service.PCService;
import com.TonyYTan.ProductAndCategories.models.Product;

@Controller
public class HomeController {
	@Autowired
	private PCService pcSer;
	
	//go to the new product page
	@GetMapping("/newproduct")
	public String newProductPage() {
		return "newproduct.jsp";
	}
	
	//go to the new category page
	@GetMapping("/newcategory")
	public String newCategoryPage() {
		return "newcategory.jsp";
	}
	
	//create the new product
	@PostMapping("/newproduct/add")
	public String newProductAdd(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "redirect:/newcategory";
		}
		return this.pcSer.addThisProduct(null, product)
	}
}
