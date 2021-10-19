package com.TonyYTan.ProductAndCategories.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TonyYTan.ProductAndCategories.Repository.CategoryRepository;
import com.TonyYTan.ProductAndCategories.Repository.ProductRepository;
import com.TonyYTan.ProductAndCategories.models.Category;
import com.TonyYTan.ProductAndCategories.models.Product;

@Service
public class PCService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
    // retrieve an instance of a category using another method in the service.	
	public Category getCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
    // retrieve an instance of a product using another method in the service.	
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}

    // add the product to this category's list of products
	public Category addThisProduct(Long id, Product product) {
		Category thisCategory = this.getCategory(id);
		thisCategory.getProducts().add(product);
		return this.cRepo.save(thisCategory);
	}
	
	//add the category to this product's list of the category
	public Product addThisCategory(Long id, Category category) {
		Product thisProduct = this.getProduct(id);
		thisProduct.getCategories().add(category);
		return this.pRepo.save(thisProduct);
	}
}
