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

	
	//find all categories that is not assigned to this product
	public List<Category> findAllUnAssignedCateToThisPro(Product thisProduct){
		return this.cRepo.findByProductsNotContains(thisProduct);
	}
	
	//find all products that is not assigned to this category
	public List<Product> findAllUnAssignedProToThisCate(Category thisCate){
		return this.pRepo.findByCategoriesNotContains(thisCate);
	}
	
	
	
    // add the product to this category's list of products
	public Category addThisProduct(Category thisCategory, Product product) {
		//Category thisCategory = this.getCategory(id);
		thisCategory.getProducts().add(product);
		return this.cRepo.save(thisCategory);
	}
	
	//add the category to this product's list of the category
	public Product addThisCategory(Product thisProduct, Category category) {
		//Product thisProduct = this.getProduct(id);
		thisProduct.getCategories().add(category);
		//System.out.println(product.getCategories());
		return this.pRepo.save(thisProduct);
	}
	
	
	
	
	//find category under a product
	public List<Category> findAllCateInAProduct(Product product){
		return this.cRepo.findAllByProducts(product);
	}
	
	//find product under a category
	public List<Product> findAllProdInACategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	
	//drop a category from a product
	public void dropThisCate(Product product, Category category) {
		//System.out.println(thisProduct.getName());
		List<Category> cateOfThisProduct = product.getCategories();
		//System.out.println(cateOfThisProduct);
//		Category thisCategory = this.pcSer.getCategory(categoryId);
//		System.out.println(thisProduct.getCategories());
		//System.out.println(cateOfThisProduct);
		cateOfThisProduct.remove(category);
		//System.out.println(cateOfThisProduct);
//		thisProduct.setCategories(cateOfThisProduct);
//		System.out.println(thisProduct.getCategories());
		this.pRepo.save(product);
		//System.out.println(product.getCategories());
	}
	
	
	//drop a product from a category
	public void dropThisProd(Category category, Product product) {
		List<Product> proOfThisCategory = category.getProducts();
		proOfThisCategory.remove(product);
		this.cRepo.save(category);
		
	}
	
}
