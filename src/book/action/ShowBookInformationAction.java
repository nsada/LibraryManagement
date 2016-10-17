package book.action;

import com.opensymphony.xwork2.Action;

import author.domain.Author;
import authors.service.AuthorService;
import book.domain.Book;
import book.service.BookService;

public class ShowBookInformationAction implements Action {
	private String ISBN;
	private Book book;
	private Author author;	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String execute() throws Exception {
		//System.out.println("ISBN："+ISBN);		
		BookService bs = new BookService();
		book = bs.getBook(ISBN);
		AuthorService as = new AuthorService();
		author = as.getAuthor(book.getAuthorID());
		return SUCCESS;
	}

}
