package ua.lviv.iot.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.data.BookstoreRepository;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;

@Service
public class BookstoreService {
	@Autowired
	private BookstoreRepository bookstoreRepository;

	public Bookstore createBookstore(Bookstore bookstore) {

		return bookstoreRepository.save(bookstore);
	}

	public List<Bookstore> findAll() {
		return bookstoreRepository.findAll();
	}

	public ResponseEntity<Bookstore> findById(Integer bookstoreId) {
		if (bookstoreRepository.findById(bookstoreId).isPresent()) {
			return new ResponseEntity<>(bookstoreRepository.getOne(bookstoreId), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	public ResponseEntity<Bookstore> updateById(Integer bookstoreId, Bookstore updateBookstore) {
		if (bookstoreRepository.findById(bookstoreId).isPresent()) {
			Bookstore bookstore = bookstoreRepository.getOne(bookstoreId);
			bookstore = updateBookstore;
			bookstoreRepository.save(bookstore);

			return new ResponseEntity<>(bookstore, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public HttpStatus deleteById(Integer bookstoreId) {
		if (bookstoreRepository.existsById(bookstoreId)) {
			bookstoreRepository.deleteById(bookstoreId);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
}
