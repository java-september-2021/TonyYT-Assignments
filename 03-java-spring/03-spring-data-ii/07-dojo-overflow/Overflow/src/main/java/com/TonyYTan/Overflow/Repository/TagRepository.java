package com.TonyYTan.Overflow.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.Overflow.models.Tag;



@Repository
public interface TagRepository extends CrudRepository <Tag, Long>{
	List<Tag> findAll(); //list all the tags
}
