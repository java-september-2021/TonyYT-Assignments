package com.TonyYTan.ProductAndCategories.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.ProductAndCategories.models.Category;
import com.TonyYTan.ProductAndCategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);
}
