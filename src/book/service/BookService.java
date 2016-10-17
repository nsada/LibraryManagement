package book.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import authors.service.AuthorService;
import book.domain.Book;
import database.Connect;

public class BookService {
	private Connect cont = new Connect();
	private List<Book> books;
	private Book book;
	
	public int addBook(Book book, String authorname){
		AuthorService as = new AuthorService();
		int authorID = -1;
		try{
			authorID= as.getAuthor(authorname).getAuthorID();
		}catch (Exception e) {
			e.printStackTrace();
		}
		if (authorID<0) return -2;
		book.setAuthorID(authorID);
		String before = "insert into book(ISBN, title, authorID";
		String sql = book.getISBN() + ",'" + 
				book.getTitle() + "'," + book.getAuthorID();
		if (book.getPublisher() != null){
			before = before + ", publisher"; 
			sql = sql + ",'" + book.getPublisher() + "'";
		}
		if (book.getPublishDate() != null){
			before = before + ", publishDate";
			sql = sql + ",'" + book.getPublishDate() + "'";
		}
		if (book.getPrice() != 0){
			before = before + ", price";
			sql = sql + "," + book.getPrice();
		}
		before = before + ") values(";
		sql = before + sql + ")";
		int i = cont.executeUpdate(sql);
		//System.out.println("成功添加Book "+i+ " sql:"+sql);
		return i;
	}
	public List<Book> getAllBooks() {
		books = new ArrayList<>();
		String sql = "select * from book";
		ResultSet result = cont.executeQuery(sql);
		try{
			while (result.next()){
				book = new Book();
				book.setISBN(result.getString("ISBN"));
				book.setTitle(result.getString("title"));
				book.setAuthorID(result.getInt("authorID"));
				book.setPublisher(result.getString("publisher"));
				book.setPublishDate(result.getDate("publishDate"));
				book.setPrice(result.getDouble("price"));
				books.add(book);
			}
		}catch (Exception e) {
			e.printStackTrace();
			books = null;
		}
		return books;	
	}
	public List<Book> getBooks(int authorID) {
		books = new ArrayList<>();
		String sql = "select * from book where authorID='" + authorID + "'";
		ResultSet result = cont.executeQuery(sql);
		System.out.println("result: "+result);
		try{
			while (result.next()){
				book = new Book();
				book.setISBN(result.getString("ISBN"));
				book.setTitle(result.getString("title"));
				book.setAuthorID(result.getInt("authorID"));
				book.setPublisher(result.getString("publisher"));
				book.setPublishDate(result.getDate("publishDate"));
				book.setPrice(result.getDouble("price"));
				books.add(book);
			}
		}catch (Exception e) {
			e.printStackTrace();
			books = null;
		}
		return books;
	}
	public Book getBook(String ISBN) {
		String sql = "select * from book where ISBN='" + ISBN + "'";
		ResultSet result = cont.executeQuery(sql);
		//System.out.println("result: "+result);
		try{
			if (result.next()){
				book = new Book();
				book.setISBN(result.getString("ISBN"));
				book.setTitle(result.getString("title"));
				book.setAuthorID(result.getInt("authorID"));
				book.setPublisher(result.getString("publisher"));
				book.setPublishDate(result.getDate("publishDate"));
				book.setPrice(result.getDouble("price"));
			}
		}catch (Exception e) {
			e.printStackTrace();
			book = null;
		}
		return book;	
	}
	public int delBook(String ISBN) {
		String sql = "delete from book where ISBN='" + ISBN + "'";
		int i = cont.executeUpdate(sql);
		//System.out.println("成功删除Book "+i+ " sql:"+sql);
		return i;
	}
	public int updateBook(Book book, String authorname) {
		AuthorService as = new AuthorService();
		int authorID = -1;
		
		if (authorname.length() > 0){
			try{
				authorID= as.getAuthor(authorname).getAuthorID();
			}catch (Exception e) {
				e.printStackTrace();
			}
			if (authorID<0) return -2;			
		}
		
		book.setAuthorID(authorID);
		String sql = "UPDATE book SET ";
		if (book.getAuthorID() != -1){
			sql = sql + "authorID=" + book.getAuthorID() + ","; 
		}
		if (book.getPublisher().length() > 0){
			sql = sql + " publisher='" + book.getPublisher() + "',";
		}
		if (book.getPublishDate() != null){
			sql = sql + " publishDate='" + book.getPublishDate() + "',";
		}
		if (book.getPrice() != 0){
			sql = sql + " price=" + book.getPrice() + ",";
		}
		sql = sql.substring(0, sql.length()-1);
		sql = sql + " WHERE ISBN='" + book.getISBN() + "'";
		int i = cont.executeUpdate(sql);
		//System.out.println("成功更新Book "+i+ " sql:"+sql);
		return i;	
	}
}
