package gtfds;

public class Book {
	
private int bookId;
private String bookName;
private String author;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Book(int bookId, String bookName, String author) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}


}
