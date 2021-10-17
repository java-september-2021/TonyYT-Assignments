package com.TonyYTan.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    // this method retrieves all the books from the database
    List<Book> findAll();// this translate to SELECT * FROM Books in MySQL
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    
    
    //Now that you've had a chance to work with the CRUD repository a bit, let's have a quick look at it's other capabilities.
    //The Spring Data JPA Query creation can seem magical at first, and it takes some experience writing in it to get a good feel for the queries, but it will automatically build queries from method names in your interface. Thus if you were looking for all the books containing "magic" in the description, you could add the following to your interface and start using it as though you had written the query:
    List<Book> findByDescriptionContaining(String search);
    
    
    //You would then call it from your service as you would any other method and get back an Iterable of books! Let's say you were interested in counting all the books with titles containing the word "java", then you could add this to your repository:
    Long countByTitleContaining(String search);
    
    //What about deleting everything starting with a particular string?
    Long deleteByTitleStartingWith(String search);
}

