package user.domain;

public class User {
	private Integer userID;
	private String name;
	private String password;
	
	public User(){};
	
	public User(Integer userID, String name, String password) {
		super();
		this.userID = userID;
		this.name = name;
		this.password = password;
	}
	public Integer getUserID() {
		return userID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void print(){
		System.out.println("user: "+this.userID+' '+this.name+' '+this.password);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}	
	
}
