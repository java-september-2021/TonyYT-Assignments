package com.TonyYTan.ProductAndCategories.HomeController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.TonyYTan.ProductAndCategories.Service.PCService;
import com.TonyYTan.ProductAndCategories.models.Category;
import com.TonyYTan.ProductAndCategories.models.Product;

@Controller
public class HomeController {
	@Autowired
	private PCService pcSer;
	
	//go to the home page
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("categories", this.pcSer.findAllCategory());
		model.addAttribute("products", this.pcSer.finlAllProduct());
		return "index.jsp";
	}
	
	
	//go to the new product page
	@GetMapping("/newproduct")
	public String newProductPage(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		return "newproduct.jsp";
	}
	
	//go to the new category page
	@GetMapping("/newcategory")
	public String newCategoryPage(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		return "newcategory.jsp";
	}
	
	//create a new product 
	@PostMapping("/newproduct/add")
	public String newProductAdd(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/newproduct";
		}
		this.pcSer.createProduct(product);
		return "redirect:/";
	}
	
	
	//create a new category
	@PostMapping("/newcategory/add")
	public String newCategoryAdd(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/newcategory";
		}
		this.pcSer.createCategory(category);
		return "redirect:/";
	}
	
	
	//Go to the page to add category to a product
	@GetMapping("/product/{id}")
	public String productCate(Model model,@PathVariable ("id") Long id, @ModelAttribute("category") Category category) {
		model.addAttribute("thisProductCategories",this.pcSer.getProduct(id).getCategories());
		model.addAttribute("categories",this.pcSer.findAllCategory());
		model.addAttribute("thisProduct", this.pcSer.getProduct(id));
		return "addcatetopro.jsp";
	}
	
	
	
	//aadd a category to a product
	@PostMapping("/product/{id}/category")
	public String newProductAdd(Model model, @PathVariable ("id") Long id, @ModelAttribute("category") Category category) {
		//model.addAttribute("thisProduct",this.pcSer.getProduct(id));
		Product product = this.pcSer.getProduct(id);
		System.out.println("the product is " + product.getName());
		System.out.println("the select category is " + category.getName());
		System.out.println("the select category is " + category.getId());
		this.pcSer.addThisCategory(product, category);
		return "redirect:/product/{id}";
	}
	
	
	//delete a category
	@GetMapping("/category/{id}/delete")
	public String deleteThisCate(@PathVariable("id") Long id) {
		this.pcSer.deleteACategory(id);
		return "redirect:/";
	}
	
	//delete a product
	@GetMapping("/product/{id}/delete")
	public String deleteThisProduct(@PathVariable("id") Long id) {
		this.pcSer.deleteAProduct(id);
		return "redirect:/";
	}
}
