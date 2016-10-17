package book.action;


import com.opensymphony.xwork2.Action;

import authors.service.AuthorService;
import book.domain.Book;
import book.service.BookService;

public class AddBookAction implements Action {
	private Book book;
	private String authorname;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String execute() throws Exception {
		BookService bs = new BookService();		
		int i = bs.addBook(book, authorname);
		//System.out.println("第一次addBook " + i);
		if (i == -2 ){
			AuthorService as = new AuthorService();
			int j = as.addAuthor(authorname);
			if (j<0) return ERROR;
			i = bs.addBook(book, authorname);
			//System.out.println("第二次addBook " + i);
		}
		
		if (i<0) return ERROR;
		return SUCCESS;
	}

}
