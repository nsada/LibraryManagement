package book.action;

import com.opensymphony.xwork2.Action;

import book.domain.Book;
import book.service.BookService;

public class DelBookAction implements Action {
	private String ISBN;
	private Book book;
	
	
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
	
	@Override
	public String execute() throws Exception {
		System.out.println("ISBN："+ISBN);		
		BookService bs = new BookService();
		book = bs.getBook(ISBN);
		int i = bs.delBook(ISBN);
		if (i < 0) return ERROR;
		return SUCCESS;
	}
}
