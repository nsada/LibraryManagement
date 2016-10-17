package author.domain;

public class Author {
	private Integer authorID;
	private String name;
	private String country;
	private int age;
	
	public void print(){
		System.out.println("author: "+this.authorID+' '+this.name+' '+this.country+' '+this.age);		
	}
	public Integer getAuthorID() {
		return authorID;
	}
	public void setAuthorID(Integer authorID) {
		this.authorID = authorID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
