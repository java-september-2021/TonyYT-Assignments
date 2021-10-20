package com.TonyYTan.ProductAndCategories.Service;

import java.util.List;

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
	
	//list all the product
	public List<Product> finlAllProduct(){
		return this.pRepo.findAll();
	}
	
	//list all the category
	public List<Category> findAllCategory(){
		return this.cRepo.findAll();
	}
	
	//create a product
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	//delete a product
	public void deleteAProduct(Long id) {
		this.pRepo.deleteById(id);
	}

	//create a category
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//delete a category
	public void deleteACategory(Long id) {
		this.cRepo.deleteById(id);
	}
	
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
	public Product addThisCategory(Product product, Category category) {
		//Product thisProduct = this.getProduct(id);
		product.getCategories().add(category);
		//System.out.println(product.getCategories());
		return this.pRepo.save(product);
	}
	
	
	
	
	//find category under a product
	public List<Category> findAllCateInAProduct(Product product){
		return this.cRepo.findAllByProducts(product);
	}
	
	//find product under a category
	public List<Product> findAllProdInACategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	
}
