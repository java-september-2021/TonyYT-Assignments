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
    	System.out.println("finalAll()");
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
//        Optional<Book> optionalBook = bookRepository.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
    	return this.bookRepository.findById(id).orElse(null);
    }
    
 

 
 //update a book 
 public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	 Book book = this.bookRepository.findById(id).orElse(null);
	 book.setTitle(title); 	
	 book.setDescription(desc);
	 book.setLanguage(lang);
	 book.setNumberOfPages(numOfPages);
	 return this.bookRepository.save(book);	 
 }
 
 
// @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
// public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//     Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
//     return book;
// }
 
 
 

 
 //delete a book
 public void deleteBook(Long id) {
	 this.bookRepository.deleteById(id);
 }
}