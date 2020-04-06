package ua.lviv.iot.rest.RestAplication.controller;

import java.util.HashMap;
//import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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

import ua.lviv.iot.business.BookstoreService;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;

@RequestMapping("/bookstores")
@RestController
public class BookstoreController {
	@Autowired
	private BookstoreService bookstoreService;

	@GetMapping
	public List<Bookstore> getBookstores() {
		return bookstoreService.findAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Bookstore> getBookstore(final @PathVariable("id") Integer bookstoreId) {
		return bookstoreService.findById(bookstoreId);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })

	public Bookstore createBookstore(@RequestBody Bookstore bookstore) {
		bookstoreService.createBookstore(bookstore);
		return bookstore;
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Bookstore> deleteById(@PathVariable("id") Integer bookstoreId) {
		HttpStatus status = bookstoreService.deleteById(bookstoreId);
		return ResponseEntity.status(status).build();
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Bookstore> updateBookstore(final @PathVariable("id") Integer bookstoreId,
			final @RequestBody Bookstore bookstore) {
		bookstore.setId(bookstoreId);
		return bookstoreService.updateById(bookstoreId, bookstore);

	}
}