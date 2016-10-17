package user.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Connect;
import user.domain.User;


public class UserService {
	private Connect cont = new Connect();
	private User user;
	private List<User> users;
	

	public User loginUser(User user) {
		String sql = "select * from user where name='" + user.getName() + "' and password='" + user.getPassword() + "'";
		ResultSet result = cont.executeQuery(sql);
		user = new User();
		try{
			if (result.next()){
				user.setUserID(result.getInt("userID"));
				user.setName(result.getString("name"));
				user.setPassword(result.getString("password"));
			}
		}catch (Exception e) {
			user = null;
		}
		return user;
	}

	public int addUser(User user) {
		String sql = "insert into user(userID, name, password) values(" + user.getUserID() + ",'" +
				user.getName() + "','" + user.getPassword() + "')";
		int i = cont.executeUpdate(sql);
		return i;
	}
	public List<User> getAllUsers() {
		String sql = "select * from user";
		ResultSet result = cont.executeQuery(sql);
		users = new ArrayList<>();		
		try{
			while (result.next()){
				user = new User();
				user.setUserID(result.getInt("userID"));
				user.setName(result.getString("name"));
				user.setPassword(result.getString("password"));
				users.add(user);
			}
		}catch (Exception e) {
			users = null;
		}
		return users;		
	}
	public void printUsers(){
		System.out.println("访问users_________________________");
		for (int i = 0; i < users.size(); i++)
			users.get(i).print();
	}
}