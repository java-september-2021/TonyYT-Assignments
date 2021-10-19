package com.TonyYTan.ProductAndCategories.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.ProductAndCategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{
	List<Category> findAll();
}
