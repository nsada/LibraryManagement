package author.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import authors.service.AuthorService;
import book.domain.Book;
import book.service.BookService;

public class SearchBooksOfAuthorAction implements Action {
	private String authorname;
	private List<Book> books;
	
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String execute() throws Exception {
		AuthorService as = new AuthorService();
		int authorID=0;
		try{
			authorID = as.getAuthor(authorname).getAuthorID();
			if (authorID < 1){
				return ERROR;
			}
		}catch (Exception e) {
			return ERROR;
		}
		
		BookService bs = new BookService();
		books = bs.getBooks(authorID);		
		ActionContext actCtx = ActionContext.getContext();
		Map<String, Object> sess = actCtx.getSession();
		sess.put("authorname", authorname);
		return SUCCESS;
	}

}
