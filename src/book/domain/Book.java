package book.domain;

import java.sql.Date;

public class Book {
	private String ISBN;
	private String title;
	private int authorID;
	private String publisher;
	private Date publishDate;
	private double price;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void print(){
		System.out.println("book: "+this.ISBN+' '+this.title+' '+this.authorID+' '+this.publisher+' '+this.publishDate+' '+this.price);
	}

	
}
