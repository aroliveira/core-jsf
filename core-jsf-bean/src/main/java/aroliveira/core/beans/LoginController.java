package aroliveira.core.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("loginController")
@SessionScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = -6225344588255570384L;
	
	@Inject
	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	public String verifyUser(){
		
		if (userBean.getPassword() == null || userBean.getPassword().isEmpty()) 
			return "newUser";
		
		if (userBean.getName().equalsIgnoreCase(userBean.getPassword()))
			return "sucess";
			
		return "fail";
	}
	
	public String newUser(){
		return "sucess";		
	}
}