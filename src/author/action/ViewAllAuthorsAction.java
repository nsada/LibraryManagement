package author.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import author.domain.Author;
import authors.service.AuthorService;

public class ViewAllAuthorsAction implements Action {
	private List<Author> authors;
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	//@Override
	public String execute() throws Exception {
		AuthorService bs = new AuthorService();
		try{
			setAuthors(bs.getAllAuthors());
		}catch (Exception e) {
			return ERROR;
		}		
		return SUCCESS;
	}


}
