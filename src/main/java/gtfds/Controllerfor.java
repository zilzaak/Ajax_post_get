package gtfds;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controllerfor {

	List<Book> bookStore = new ArrayList<>();
public List<Book> getall(){
	Book b = new Book(1,"fg","df");Book b2 = new Book(1,"fg","df");
	Book b1 = new Book(1,"fg","df");
	bookStore.add(b);bookStore.add(b1);bookStore.add(b2);
	return bookStore;
}
	@PostMapping("/saveBook")
	public ResponseEntity<Object> addBook(@RequestBody Book book) {
		bookStore.add(book);
		Serviceres   <Book> response = new Serviceres<Book>("success", book);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@GetMapping("/getBooks")
	
	public ResponseEntity<Object> getAllBooks() {
		List<Book> Store=getall();
		Serviceres<List<Book>> response = new Serviceres<List<Book>>("success", Store);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
}
