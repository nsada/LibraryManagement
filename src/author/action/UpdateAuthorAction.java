package author.action;

import com.opensymphony.xwork2.Action;

import author.domain.Author;
import authors.service.AuthorService;

public class UpdateAuthorAction implements Action {
	private Author author;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String execute() throws Exception {//addAuthor
		author.setAuthorID(id);
		
		//System.out.println("成功进入UpdateAuthorAction authorID=" + author.getAuthorID());
		
		AuthorService bs = new AuthorService();		
		int i = bs.updateAuthor(author, id);
		
		if (i<0) return ERROR;
		return SUCCESS;
	}
	

}
