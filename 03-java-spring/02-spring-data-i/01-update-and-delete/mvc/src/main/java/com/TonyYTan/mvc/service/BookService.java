package com.TonyYTan.mvc.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TonyYTan.mvc.models.Book;
import com.TonyYTan.mvc.repository.BookRepository;


@Service
public class BookService {
 // adding the book repository as a dependency
 private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 
 
 //update a book
 public void deleteBook(Long id) {
	 Optional<Book> optionalBook = bookRepository.findById(id);
	 if(optionalBook.isPresent()) {
		  bookRepository.deleteById(id);
	 }else {
		 System.out.println("there is no such as book");
	 }
 }
}