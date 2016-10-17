package author.action;

import com.opensymphony.xwork2.Action;

import author.domain.Author;
import authors.service.AuthorService;

public class AddAuthorAction implements Action {
	private Author author;
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String execute() throws Exception {
		AuthorService as = new AuthorService();		
		as.addAuthor(author);
		
		return SUCCESS;
	}
	

}
