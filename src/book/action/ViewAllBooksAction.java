package book.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import book.domain.Book;
import book.service.BookService;

public class ViewAllBooksAction implements Action {
	private List<Book> books;
	
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String execute() throws Exception {
		BookService bs = new BookService();
		try{
			setBooks(bs.getAllBooks());
		}catch (Exception e) {
			return ERROR;
		}		
		return SUCCESS;
	}

}
