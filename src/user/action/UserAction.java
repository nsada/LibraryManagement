package user.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import user.domain.User;
import user.service.UserService;

import java.util.Map;

public class UserAction implements Action {
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {	
		UserService us = new UserService();
		User new_user= new User();		
		try{
			new_user = us.loginUser(user);
		}catch (Exception e) {
			new_user = null;
		}		
		if (new_user == null) return ERROR;
		try{
			if (new_user.getUserID() > 0){
				ActionContext actCtx = ActionContext.getContext();
				Map<String, Object> sess = actCtx.getSession();
				sess.put("username", new_user.getName());
				sess.put("userid", new_user.getUserID());
				return SUCCESS;			
			}
		}catch (Exception e){
			return ERROR;
		}
		return ERROR;
	}
	
	public String regist(){
		UserService us = new UserService();
		int i = us.addUser(user);
		if (i > -1) return SUCCESS;
		return ERROR;		
	}

}
