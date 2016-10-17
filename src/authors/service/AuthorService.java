package authors.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import author.domain.Author;
import database.Connect;

public class AuthorService {
	private Connect cont = new Connect();
	private List<Author> authors;
	private Author author;
	public int addAuthor(Author author) {
		//System.out.println("成功进入addAuthorService");
		String sql = "insert into author(authorID, name, country, age) values(" + author.getAuthorID() + ",'" +
				author.getName() + "','" + author.getCountry() + "','" + author.getAge() + "')";
		int i = cont.executeUpdate(sql);
		return i;
	}
	public List<Author> getAllAuthors() {
		authors = new ArrayList<>();
		String sql = "select * from author";
		ResultSet result = cont.executeQuery(sql);
		//System.out.println("成功进入getAllauthors");
		try{
			while (result.next()){
				author = new Author();
				author.setAuthorID(result.getInt("authorID"));
				author.setName(result.getString("name"));
				author.setCountry(result.getString("country"));
				author.setAge(result.getInt("age"));
				authors.add(author);
			}
		}catch (Exception e) {
			e.printStackTrace();
			authors = null;
		}
		return authors;	
	}
	public Author getAuthor(String authorname) {
		String sql = "select * from author where name='" + authorname + "'";
		ResultSet result = cont.executeQuery(sql);

		author = new Author();
		try{
			if (result.next()){		
				author.setAuthorID(result.getInt("authorID"));
				author.setName(result.getString("name"));
				author.setCountry(result.getString("country"));
				author.setAge(result.getInt("age"));
			}
		}catch (Exception e){
			e.printStackTrace();
			author = null;			
		}
		return author;
	}
	public int addAuthor(String name) {
		String sql = "insert into author (name) values ('" + name + "')";
		int i = cont.executeUpdate(sql);
		return i;
	}
	public Author getAuthor(int authorID) {
		String sql = "select * from author where authorID='" + authorID + "'";
		ResultSet result = cont.executeQuery(sql);

		author = new Author();
		try{
			if (result.next()){		
				author.setAuthorID(result.getInt("authorID"));
				author.setName(result.getString("name"));
				author.setCountry(result.getString("country"));
				author.setAge(result.getInt("age"));
			}
		}catch (Exception e){
			e.printStackTrace();
			author = null;			
		}
		return author;
	}
	public int updateAuthor(Author author, int id) {
		String sql = "UPDATE author SET"; 
		if (author.getName().length() > 0){
			sql = sql + " name='" + author.getName() + "',"; 
		}
		if (author.getCountry().length() > 0){
			sql = sql + " country='" + author.getCountry() + "',";
		}
		if (author.getAge() != 0){
			sql = sql + " age=" + author.getAge() + ",";
		}
		if (sql.length() <= 17)
			return 1;
		sql = sql.substring(0, sql.length()-1);
		sql = sql + " WHERE authorID='" + id + "'";
		int i = cont.executeUpdate(sql);
		//System.out.println("成功更新Author "+i+ " sql:"+sql);
		return i;	
	}
}
