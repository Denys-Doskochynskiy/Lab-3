package ua.lviv.iot.rest.RestAplication.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.rest.RestAplication.model.Bookstore;



@RequestMapping("/bookstores")
@RestController
public class BookstoreController {
static	private Map<Integer, Bookstore> bookstores = new HashMap<>();
static	private AtomicInteger idCounter = new AtomicInteger();

	@GetMapping
	public List<Bookstore> getBookstores() {
		
		
		return new LinkedList<Bookstore>(bookstores.values());
	}

	@GetMapping(path = "/{id}")
	public Bookstore getStudent(final @PathVariable("id") Integer studentId) {
		return bookstores.get(studentId);
	}

	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})

  public Bookstore createStudent(final @RequestBody Bookstore bookstore) {
	  bookstore.setId(idCounter.incrementAndGet());
	  bookstores.put(bookstore.getId(), bookstore);
	  return bookstore ;
  }

	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Bookstore> deleteBookstore(@PathVariable("id") Integer bookstoreId) {
HttpStatus status = bookstores.remove(bookstoreId)==null ?HttpStatus.NOT_FOUND :HttpStatus.OK;
		
		return ResponseEntity.status(status).build();
	}
	
	
	
	@PutMapping(path="/{id}")
	public Bookstore updateBookstore(final @PathVariable("id") Integer bookstoreId,final @RequestBody Bookstore bookstore) {
		bookstore.setId(bookstoreId);
	
		return bookstores.put(bookstoreId,bookstore);
	}
}