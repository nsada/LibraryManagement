package book.action;


import com.opensymphony.xwork2.Action;

import authors.service.AuthorService;
import book.domain.Book;
import book.service.BookService;


public class UpdateBookAction implements Action {
	private Book book;
	private String authorname;
	private String ISBN;
	
	
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
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String execute() throws Exception {
		book.setISBN(ISBN);
		
		System.out.println("成功进入UpdateBookAction ISBN=" + book.getISBN());
		
		BookService bs = new BookService();		
		int i = bs.updateBook(book, authorname);
		if (i == -2 ){
			AuthorService as = new AuthorService();
			int j = as.addAuthor(authorname);
			if (j<0) return ERROR;
			i = bs.updateBook(book, authorname);
		}
		
		if (i<0) return ERROR;
		return SUCCESS;
	}

}
